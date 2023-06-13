SUMMARY = "Khmer language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Khmer language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-khm-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "6f1d2d6f76708b11213b55094efef17a8e96d6a698db68c84f51ffdbf380720f178a843f186b0d396f4e1248692ae0af610179f5e7d8c3c9d30de267380ba781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-khm \
tesseract-ocr-traineddata-khmer \
tesseract-traineddata-khmer"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
