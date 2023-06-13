SUMMARY = "Cebuano language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Cebuano language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ceb-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "ad96caa562d3cc33e2e91d350a5a793a09e8cea389c59f2cf4533f594f02150447a9738af49d531c847b3d430a29cf4443f02a2bae57d51b8c10079184211d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ceb \
tesseract-ocr-traineddata-cebuano \
tesseract-traineddata-cebuano"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
