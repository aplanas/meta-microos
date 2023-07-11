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

RPM_NAME = "python39-fanficfare-4.21.0-2.4.noarch.rpm"
RPM_HASH = "da6c6e93d39894f90a633bd554be8ca906848cf4bce7d67c10fe46187f83cec53900e26b2366f0077f2bfacb973e847601eb5b53b431edc7ec6ea241110dae4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fanficfare \
python39-fanficfare \
python3dist-fanficfare"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-beautifulsoup4 \
python39-chardet \
python39-cloudscraper \
python39-html2text \
python39-html5lib \
python39-requests-file \
python39-setuptools \
update-alternatives"

inherit rpm
