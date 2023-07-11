SUMMARY = "Client for the whois.cymrucom service"
DESCRIPTION = "Perform lookups by ip address and return ASN, Country Code, \
and Netblock Owner."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python39-cymruwhois-1.6-2.15.noarch.rpm"
RPM_HASH = "7382ecfb32555e1902a508b95e14b966e1203b248fc044aee48f8023d032497eba441df5af862e9defb445e910c5753eb0b5d040a54b8c66b828c444a7ed5da7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cymruwhois \
python3.9dist-cymruwhois \
python39-cymruwhois \
python3dist-cymruwhois"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
