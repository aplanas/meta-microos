SUMMARY = "Han (Simplified, Vertical) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Han (Simplified, Vertical) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-hans_vert-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "09a595c2758e820f3735fcf4636986e2d570ffa3369f06fdf6c0dcda65a5eea880dbc285cb6bc4d12a7877a0765b558236210714cc2a00f005157fc25eec3857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hans_vert"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
