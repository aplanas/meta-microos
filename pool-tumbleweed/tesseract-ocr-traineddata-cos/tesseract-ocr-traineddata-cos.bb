SUMMARY = "Corsican language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Corsican language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-cos-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "6fc06b2a9dfab257355fafea75884839866435560fa91bef7f04ae7be89f7e36c5184e6265e1c172499ad1a2faf6d83f326f727438e758fc4c3f6558dbbf4833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-corsican \
tesseract-ocr-traineddata-cos \
tesseract-traineddata-corsican"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
