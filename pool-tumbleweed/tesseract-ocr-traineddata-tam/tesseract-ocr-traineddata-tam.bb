SUMMARY = "Tamil language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tamil language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-tam-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "c7e8ef3a9a1617d7ae0ec21b82eedb21c706981948b52210287dae9d44b3025047f8d1d433eb965ec74dfb1499bbdd20ede6a3552f86f02c3ad4733945099d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-tam \
tesseract-ocr-traineddata-tamil \
tesseract-traineddata-tamil"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
