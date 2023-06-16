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

RPM_NAME = "python310-fanficfare-4.21.0-2.2.noarch.rpm"
RPM_HASH = "5495ecbbfe2941706aef1bc9e3c1c26b7058817e98f30da160e5166140f2d50b4bf511eeb2c57cf123a9ce33076f3d941040e66e60aecea53a628414a6055f9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fanficfare \
python3.10dist-fanficfare \
python310-fanficfare \
python3dist-fanficfare"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-beautifulsoup4 \
python310-chardet \
python310-cloudscraper \
python310-html2text \
python310-html5lib \
python310-requests-file \
python310-setuptools \
update-alternatives"

inherit rpm
