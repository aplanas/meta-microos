SUMMARY = "Client for the whois.cymrucom service"
DESCRIPTION = "Perform lookups by ip address and return ASN, Country Code, \
and Netblock Owner."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python39-cymruwhois-1.6-2.13.noarch.rpm"
RPM_HASH = "51f77113fbb8f6daa37491da057f81050a5d9515437b5d4cfb891057173dff5246019d3c0418bc9792907582b503beaa7d9dc67a7c6edfebe46b29e4818caa50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cymruwhois \
python3.9dist-cymruwhois \
python39-cymruwhois \
python3dist-cymruwhois"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
