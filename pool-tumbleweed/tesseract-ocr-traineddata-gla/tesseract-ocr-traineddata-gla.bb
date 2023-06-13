SUMMARY = "Gaelic; Scottish Gaelic language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Gaelic; Scottish Gaelic language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-gla-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "0024c69f3fb4aae9b7945ffbe5446edaae199a109ff81a0ad4716dd472f7a1794e19c5b63385d36435c2270fb119082d7009c4c5d0c9c9275b871f6042f5b77d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-gaelic \
tesseract-ocr-traineddata-gla \
tesseract-traineddata-gaelic"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
