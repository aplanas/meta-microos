SUMMARY = "Swahili language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Swahili language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-swa-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "a0c1ecdea88f5e4082d619124c8c6e32b768ca529dab2184d3193ebd131560d88c4d7e635cb8b2a50319527a50db9f24407feb9a5761be8dbd31c8678df34ba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-swa \
tesseract-ocr-traineddata-swahili \
tesseract-traineddata-swahili"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
