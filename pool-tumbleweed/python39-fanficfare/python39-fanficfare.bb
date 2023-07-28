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

RPM_NAME = "python39-fanficfare-4.25.0-1.1.noarch.rpm"
RPM_HASH = "0ba64b1fd0c0776d99d884353de6c7c69ff4e943f68c516840765efaf4b9b870dc8434562725d70cee769971d061f4a9373a5fd9ef923a8f969cf25e2b865f14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fanficfare \
python39-fanficfare \
python3dist-fanficfare"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Brotli \
python39-beautifulsoup4 \
python39-chardet \
python39-cloudscraper \
python39-html2text \
python39-html5lib \
python39-requests \
python39-requests-file \
python39-urllib3 \
update-alternatives"

inherit rpm
