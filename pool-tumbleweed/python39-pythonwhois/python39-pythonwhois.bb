SUMMARY = "Python whois library"
DESCRIPTION = "Module for retrieving and parsing the WHOIS data for a domain."
LICENSE = "WTFPL"

PV = "2.4.3"

RPM_NAME = "python39-pythonwhois-2.4.3-5.11.noarch.rpm"
RPM_HASH = "6a32a1a05570c6be0ae6fe707d55968d1a63ee2838dce3293681d61c3bd9ec07d41510f04026a999d6ba06064864f30db16f6115f9a958c5c2ea75c32d82b7db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pythonwhois \
python39-pythonwhois \
python3dist-pythonwhois"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
