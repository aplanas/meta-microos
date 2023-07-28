SUMMARY = "Tool for making eBooks from stories on fanfiction and other web sites"
DESCRIPTION = "FanFicFare is a tool for downloading fanfiction and original stories from various sites into ebook form. \
 \
FanFicFare is the rename and move of the FanFictionDownLoader (AKA FFDL, AKA fanficdownloader) project. \
 \
Main Features of FanFicFare: \
    - Download fanfiction stories from various sites into ebooks. \
    - Create various ebook formats (currently epub, mobi, HTML, txt) \
    - Also available as a Calibre plugin (not in this package) \
    - Ability to update already downloaded book"
LICENSE = "GPL-3.0-only"

PV = "4.25.0"

RPM_NAME = "python310-fanficfare-4.25.0-1.1.noarch.rpm"
RPM_HASH = "9bc94bc79b3c6d67a2e07dc7b486893893f68660d5f8f5adc8293145f90ead686e90d1b905119e28778f7d57dc2bf165087f2d5d65610fa681ca478f095395ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fanficfare \
python310-fanficfare \
python3dist-fanficfare"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Brotli \
python310-beautifulsoup4 \
python310-chardet \
python310-cloudscraper \
python310-html2text \
python310-html5lib \
python310-requests \
python310-requests-file \
python310-urllib3 \
update-alternatives"

inherit rpm
