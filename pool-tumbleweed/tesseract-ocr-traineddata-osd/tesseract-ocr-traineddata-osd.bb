SUMMARY = "Orientation & Script Detection Data for tesseract"
DESCRIPTION = "Orientation & Script Detection data for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-osd-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "e879a270bfc71895f47de63accf97fbd344bf00a5e48f09b3bf62faed46c48b76392daaf5883145045778500e55b3d3777197f4f880a6e9aab9d043bfc4f552c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-orientation-and-script-detection \
tesseract-ocr-traineddata-osd"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
