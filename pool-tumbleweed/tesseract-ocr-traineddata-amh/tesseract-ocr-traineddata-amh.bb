SUMMARY = "Amharic language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Amharic language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-amh-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "f60be004944b4806ba7f59ba9a7b340b7c73d1d66ea70668894c00825f2b95e9afa513ba22958e03c281beacba59898694cd7ff4aadc3293c428dd65b27f8ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-amh \
tesseract-ocr-traineddata-amharic \
tesseract-traineddata-amharic"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
