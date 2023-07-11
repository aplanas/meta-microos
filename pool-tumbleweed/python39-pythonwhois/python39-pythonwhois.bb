SUMMARY = "Python whois library"
DESCRIPTION = "Module for retrieving and parsing the WHOIS data for a domain."
LICENSE = "WTFPL"

PV = "2.4.3"

RPM_NAME = "python39-pythonwhois-2.4.3-5.12.noarch.rpm"
RPM_HASH = "63ab9a40039812257bb453cfa6af03fd79f1e22d64e4a2c291eb15e27a4ffb08e00287bba2964f2de938ef92c4da5ea6bd8f494ef93ea7dd8ac939f46c0c2f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pythonwhois \
python39-pythonwhois \
python3dist-pythonwhois"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
