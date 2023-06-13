SUMMARY = "Bengali language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Bengali language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ben-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "76cd083f75c697a80dfdd98066f9b9f8aed7ea92aebdb6356d827389d9d629bce4ec62f106dd8853e8887ff7f9101807e4a83c2dd12794c5d272efbee1ac62cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ben \
tesseract-ocr-traineddata-bengali \
tesseract-traineddata-bengali"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
