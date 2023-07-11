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

RPM_NAME = "python311-fanficfare-4.21.0-2.4.noarch.rpm"
RPM_HASH = "12f369704674cfa931ea0dd30ef1d17210a509c3391a1348ce9cc4f491129aac21066c0bef7f42a1785a0d0d7a86c46d3a6fcd4b54c1394e11dec1fdf22b0665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fanficfare \
python3.11dist-fanficfare \
python311-fanficfare \
python3dist-fanficfare"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-beautifulsoup4 \
python311-chardet \
python311-cloudscraper \
python311-html2text \
python311-html5lib \
python311-requests-file \
python311-setuptools \
update-alternatives"

inherit rpm
