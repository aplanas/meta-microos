SUMMARY = "Afrikaans language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Afrikaans language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-afr-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "8f5c8ffaf7f10ca5eb006b86f597553a6b2ca83007acb4bbd60f8925d083699766d03a914c06501dd912bd8a3308dd1fd68f5e81168e6190eaabf3e230753981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-afr \
tesseract-ocr-traineddata-afrikaans \
tesseract-traineddata-afrikaans"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
