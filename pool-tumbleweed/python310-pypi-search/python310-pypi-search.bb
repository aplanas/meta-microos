SUMMARY = "Get Information on Python Packages From PyPI"
DESCRIPTION = "Get Information on Python Packages From PyPI"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-pypi-search-1.2.1-1.9.noarch.rpm"
RPM_HASH = "389369f2d4c20af3650e3c55403a4de6bad30e13dc8ad9082bd16972b173890a378e943ac946334f2bcd432781dace520730e2e0c9bedb6b5c291eac0fabec1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypi-search \
python3.10dist(pypi-search) \
python310-pypi-search \
python3dist(pypi-search)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-beautifulsoup4 \
python310-html2text \
python310-requests \
update-alternatives"

inherit rpm
