SUMMARY = "Python whois library"
DESCRIPTION = "Module for retrieving and parsing the WHOIS data for a domain."
LICENSE = "WTFPL"

PV = "2.4.3"

RPM_NAME = "python310-pythonwhois-2.4.3-5.12.noarch.rpm"
RPM_HASH = "7fbdc68132f223d8156a713940df6e4599aa6c5702c8432d5b8663ef9c6edd8ca81582fb09b04d0aa16dcfb87f5394ef5605e62c155d233acfb25f2f18d314c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pythonwhois \
python310-pythonwhois \
python3dist-pythonwhois"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
