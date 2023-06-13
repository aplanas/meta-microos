SUMMARY = "Uyghur language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Uyghur language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-uig-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "db117b5305ae1bf366a41a072a8437930d89b70ccd4b1ef9fec77f78ba5ed7427af3a7464750e3f38278109dd56f68dda82f463e0dd05978d356f008899dc6bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-uig \
tesseract-ocr-traineddata-uyghur \
tesseract-traineddata-uyghur"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
