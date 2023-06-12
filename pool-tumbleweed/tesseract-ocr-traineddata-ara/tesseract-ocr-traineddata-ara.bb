SUMMARY = "Arabic language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Arabic language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ara-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "4d10157ed9a9255acbb062a295a83fe0c256a637972998a0264dc1422f068ed8cd46a69e2d905b8ed31d12af08c11f176ef75ab8fd7bdf93b7acd113f9cb33ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ara \
tesseract-ocr-traineddata-arabic \
tesseract-traineddata-arabic"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
