SUMMARY = "Estonian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Estonian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-est-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "fadb292e4002250e76b52efc9bcc7d2a6d87b0815ba8f4d879cedb3e8c8f7da36e95d85bee8f874b3a7305efb7aab93b409ee972a740c9ee6902f8080f200629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-est \
tesseract-ocr-traineddata-estonian \
tesseract-traineddata-estonian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
