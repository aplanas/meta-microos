SUMMARY = "Get Information on Python Packages From PyPI"
DESCRIPTION = "Get Information on Python Packages From PyPI"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-pypi-search-1.2.1-2.1.noarch.rpm"
RPM_HASH = "9d8f0328eeb5044f6750a7d975908d5ec780c892b5cd4f730d8cd87b0be98d856562e47d87b53d90a587c707f2c6cf2132e381f28d859dad05c3f4d0312b4d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypi-search \
python310-pypi-search \
python3dist-pypi-search"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-beautifulsoup4 \
python310-html2text \
python310-requests \
update-alternatives"

inherit rpm
