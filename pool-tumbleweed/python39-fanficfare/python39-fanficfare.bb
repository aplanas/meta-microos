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

PV = "4.21.0"

RPM_NAME = "python39-fanficfare-4.21.0-2.2.noarch.rpm"
RPM_HASH = "8b027a2c206fa2cd5734bf82ce11f9940fcd191890d0227dca32b22188e93770f99ab5fdd9ff168dd9c60c894acc90a97a50ab99075e0132b5fa2765d799ce18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fanficfare) \
python39-fanficfare \
python3dist(fanficfare)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-beautifulsoup4 \
python39-chardet \
python39-cloudscraper \
python39-html2text \
python39-html5lib \
python39-requests-file \
python39-setuptools \
update-alternatives"

inherit rpm
