SUMMARY = "Get Information on Python Packages From PyPI"
DESCRIPTION = "Get Information on Python Packages From PyPI"
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-pypi-search-1.2.1-1.9.noarch.rpm"
RPM_HASH = "748f37e131345e69b090c4ecfae62470fa7e1dc2a8becdd5abd525d38bc502643ee1c5c71d789fe91c3b6007de5fb7de9762415a82657f07ea65532f48344bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pypi-search) \
python311-pypi-search \
python3dist(pypi-search)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-beautifulsoup4 \
python311-html2text \
python311-requests \
update-alternatives"

inherit rpm
