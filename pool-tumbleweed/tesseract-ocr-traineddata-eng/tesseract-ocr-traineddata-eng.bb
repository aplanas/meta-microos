SUMMARY = "English language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the English language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-eng-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "753b54e32848bdfc708dd2c70a41a38213b8cf23ac0fda231bb0edd26ea8f2e8d163e12cebec5ee43a62ad70b325ec8489907311f47825895a08840605c7de75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-eng \
tesseract-ocr-traineddata-english \
tesseract-traineddata-english"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
