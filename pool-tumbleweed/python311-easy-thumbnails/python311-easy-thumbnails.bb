SUMMARY = "Easy thumbnails for Django"
DESCRIPTION = "The powerful, yet easy to implement thumbnailing application for Django."
LICENSE = "BSD-2-Clause"

PV = "2.8.5"

RPM_NAME = "python311-easy-thumbnails-2.8.5-1.6.noarch.rpm"
RPM_HASH = "a18224e8f85ad50798f2d6a097185f74ca68089e661bf0e22f3c3e6b9ed625d497b7785c4e79b7bd71a2eb4dca8143770d5de1b611ac3d78df639a08c947d1aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easy-thumbnails \
python3.11dist-easy-thumbnails \
python311-easy-thumbnails \
python3dist-easy-thumbnails"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Pillow \
python311-lxml \
python311-reportlab \
python311-svglib"

inherit rpm
