SUMMARY = "Qt based ebook reader"
DESCRIPTION = " \
Currently supports: \
 \
* pdf \
* epub \
* mobi \
* azw / azw3 / azw4 \
* cbr / cbz"
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "lector-0.5.1-2.17.noarch.rpm"
RPM_HASH = "d5cd8c6b7f374a2cec1a14b3f5c0c22cf1eae8b8dfb3d2ac118ce487c3cb8cf14bbf949d04a67efb50357119ba3ca15e4628bedb212e115ef52cd3bf9214d9c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lector \
python3.11dist-lector \
python3dist-lector"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3 \
python3-beautifulsoup4 \
python3-lxml \
python3-qt5 \
python3-xmltodict"

inherit rpm
