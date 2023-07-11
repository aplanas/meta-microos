SUMMARY = "Client for the whois.cymrucom service"
DESCRIPTION = "Perform lookups by ip address and return ASN, Country Code, \
and Netblock Owner."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python311-cymruwhois-1.6-2.15.noarch.rpm"
RPM_HASH = "45df885d8d52cddc0dfb55c6db6e3437cffa451b932e932a8521e9192ba8a8215a73d7ea1198f6d040479a5190881cfc95792eb4b22e850efea4468b6ba535ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cymruwhois \
python3-cymruwhois \
python3.11dist-cymruwhois \
python311-cymruwhois \
python3dist-cymruwhois"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
