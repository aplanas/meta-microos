SUMMARY = "Get Information on Python Packages From PyPI"
DESCRIPTION = "Get Information on Python Packages From PyPI"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-pypi-search-1.2.1-2.1.noarch.rpm"
RPM_HASH = "f400f01aa8ab6d3621b21a8fba00423a580a29a0e2de42834a9e1c9fb2594345a63c6e2cb5dabb5175ee4e68aade744e78705cf5dada5df54c90934ea23fdf63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypi-search \
python39-pypi-search \
python3dist-pypi-search"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-beautifulsoup4 \
python39-html2text \
python39-requests \
update-alternatives"

inherit rpm
