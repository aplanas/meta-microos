SUMMARY = "Telugu language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Telugu language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-tel-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "9cbd3324fe7ce3defaf678e363d92a29da2eeb814cbffc7f4b3a259852492703bf747520090ecb68ac70e2bd7780c90518cff2c90f2929ce857cb104e977f8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-tel \
tesseract-ocr-traineddata-telugu \
tesseract-traineddata-telugu"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
