SUMMARY = "Get Information on Python Packages From PyPI"
DESCRIPTION = "Get Information on Python Packages From PyPI"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-pypi-search-1.2.1-2.1.noarch.rpm"
RPM_HASH = "97a8a656bf84cb88e15cf594d8d6d4acd97b96e9dae7982b52e4d768f677ef51c7b259eda203a832c1275076f618eaaefc5ad5c7e2d83c3810c323f849e550bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypi-search \
python3.11dist-pypi-search \
python311-pypi-search \
python3dist-pypi-search"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-beautifulsoup4 \
python311-html2text \
python311-requests \
update-alternatives"

inherit rpm
