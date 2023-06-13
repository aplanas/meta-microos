SUMMARY = "Swedish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Swedish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-swe-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "a648bfd6f9e9bb7432a27267cf86c4e6992d684dda7762a65e30c2a06b0db83ccde6fb15aa1512d07891beff5048de27728d4dc8f8a05af74cab520034ac745e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-swe \
tesseract-ocr-traineddata-swedish \
tesseract-traineddata-swedish"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
