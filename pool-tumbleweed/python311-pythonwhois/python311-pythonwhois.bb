SUMMARY = "Python whois library"
DESCRIPTION = "Module for retrieving and parsing the WHOIS data for a domain."
LICENSE = "WTFPL"

PV = "2.4.3"

RPM_NAME = "python311-pythonwhois-2.4.3-5.12.noarch.rpm"
RPM_HASH = "496c9d9872df1d38f310be419fdb09c9b2ffc0ab3470b2d372d880df8ed09212f2adf3dd57d4ff951ffd3814e2081ce6d58cb1ccfbf0ac4e9d1b70485f95e77f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythonwhois \
python3.11dist-pythonwhois \
python311-pythonwhois \
python3dist-pythonwhois"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
