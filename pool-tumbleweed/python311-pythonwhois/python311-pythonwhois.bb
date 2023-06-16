SUMMARY = "Python whois library"
DESCRIPTION = "Module for retrieving and parsing the WHOIS data for a domain."
LICENSE = "WTFPL"

PV = "2.4.3"

RPM_NAME = "python311-pythonwhois-2.4.3-5.11.noarch.rpm"
RPM_HASH = "9b6d3575ca1ef3b2afde1f604b07a2ff74a6d0e0dfdf396480f8e8b38056e14ca9f6a0a04f276b795823705dd83861d9c201d5b8c0db0081cfe9911639406c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pythonwhois \
python311-pythonwhois \
python3dist-pythonwhois"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
