SUMMARY = "Fraktur script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Fraktur script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-fraktur-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "a5b8796ce23cfe13ee326f7b45385de344bb1a5405ce710b3f65be63e7fdc430ed4c6073779aafb04155406ee3f3ad47b1a233176d20845b6a6ffca15fbf3a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-fraktur"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
