SUMMARY = "Cherokee script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Cherokee script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-cherokee-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "341fdaa1dbfcdf3a91ab8efb9267e2dffcd78d1517c84ed03bea7ce6be7cf90201ffeff9d012254673a716f43aa95e23dd5365af18c8b14c8691e859cd2427e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-cherokee"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
