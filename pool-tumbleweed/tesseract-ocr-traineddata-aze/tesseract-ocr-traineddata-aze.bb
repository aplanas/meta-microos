SUMMARY = "Azerbaijani language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Azerbaijani language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-aze-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "7c5f9b470b0a3e1c48695b2df2be8f7d713ddbc52dddd6812fea9798b7f4aa03051976cad72bfae87a49713fe2e6a27a7876b2fc0a45151adac7f3cee4a7e278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-aze \
tesseract-ocr-traineddata-azerbaijani \
tesseract-traineddata-azerbaijani"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
