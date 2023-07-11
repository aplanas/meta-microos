SUMMARY = "Client for the whois.cymrucom service"
DESCRIPTION = "Perform lookups by ip address and return ASN, Country Code, \
and Netblock Owner."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python310-cymruwhois-1.6-2.15.noarch.rpm"
RPM_HASH = "f5555501e37257a5b5f67b03218dcc1c621edd6c4cb7731458c0ae2e7efada8337dd75aced01424fce20dbff4791c0390218eb55f248b73543bcdfa4bd79a395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cymruwhois \
python3.10dist-cymruwhois \
python310-cymruwhois \
python3dist-cymruwhois"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
