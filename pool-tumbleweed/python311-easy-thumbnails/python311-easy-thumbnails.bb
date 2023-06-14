SUMMARY = "Easy thumbnails for Django"
DESCRIPTION = "The powerful, yet easy to implement thumbnailing application for Django."
LICENSE = "BSD-2-Clause"

PV = "2.8.5"

RPM_NAME = "python311-easy-thumbnails-2.8.5-1.4.noarch.rpm"
RPM_HASH = "09f2c592a0562c7abd88e1cf481711658de0cca50aa42258c5cc4ed92657a1a3f75c7556e5ddfb564ab31f062ff217d6444a41606b880ebcc0917cadf2323f13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-easy-thumbnails \
python311-easy-thumbnails \
python3dist-easy-thumbnails"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Pillow \
python311-lxml \
python311-reportlab \
python311-svglib"

inherit rpm
