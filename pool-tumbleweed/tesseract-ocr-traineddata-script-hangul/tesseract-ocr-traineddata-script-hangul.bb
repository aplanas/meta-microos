SUMMARY = "Hangul script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Hangul script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-hangul-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "d405046461ee0ed5feda8111ef83c70a921471ceb3e6bf0191fe77a113be5195e58333cbd09557f3810df1050c3876041b98d648083d871edbe3238185f4d3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hangul"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
