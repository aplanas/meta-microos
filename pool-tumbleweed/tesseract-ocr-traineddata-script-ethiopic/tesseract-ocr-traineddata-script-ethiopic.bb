SUMMARY = "Ethiopic script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Ethiopic script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-ethiopic-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "53081fbf8d54f2763ed1f40b5fcfa551d2d818853eff9e8151043390a59de5d225afd9bb022761e6632067cd3acb25956e87d590207935af6d0143d8608fb9b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-ethiopic"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
