SUMMARY = "Hebrew script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Hebrew script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-hebrew-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "5fcb6339697fd42b96172f42cfabc652af6f4eaa786e8e72e05cb8531b193392e35b3a34cb340dcbf0c70801ce9775f69df7cfe05fed05242fc53c17c96edc58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hebrew"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
