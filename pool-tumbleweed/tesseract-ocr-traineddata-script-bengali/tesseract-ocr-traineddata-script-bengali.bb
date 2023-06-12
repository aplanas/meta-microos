SUMMARY = "Bengali script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Bengali script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-bengali-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "5285b058f82771217a857bf721e068352193e8fb3fe1c04f28815f755f32697fbfd7001778bdc16dc14fd1c39d5f1a0f55fbe50d6f85d2db4afedfde54f52010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-bengali"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
