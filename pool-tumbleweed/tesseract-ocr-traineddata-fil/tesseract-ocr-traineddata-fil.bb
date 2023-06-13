SUMMARY = "Filipino; Pilipino language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Filipino; Pilipino language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-fil-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "46e29cb3f5fbcf3102f2bc13c0ca22474a75e288435131c433ff2f2c4da4a3176a074c97b17e89b28e81b8e6ced3ecacb18158cfadd6aeb737404353b95d8eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-fil \
tesseract-ocr-traineddata-filipino \
tesseract-traineddata-filipino"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
