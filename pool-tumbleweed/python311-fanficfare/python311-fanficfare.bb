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

RPM_NAME = "python311-fanficfare-4.25.0-1.1.noarch.rpm"
RPM_HASH = "d95532d43be25efd2d0a0d01d626ebf3ecca8f4183278e2f4876864655b8d00d572a0bcbb2271de4f6b078e290edca1be0d5feb92a9d2e584c9a6ac9c8fa2d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fanficfare \
python3.11dist-fanficfare \
python311-fanficfare \
python3dist-fanficfare"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Brotli \
python311-beautifulsoup4 \
python311-chardet \
python311-cloudscraper \
python311-html2text \
python311-html5lib \
python311-requests \
python311-requests-file \
python311-urllib3 \
update-alternatives"

inherit rpm
