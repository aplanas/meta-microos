SUMMARY = "Gurmukhi script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Gurmukhi script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-gurmukhi-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "0ff0f2c6e3965c3cdd12b75a2b2832c37618e059cbb88a719fa0afc59b055d1e67165eb271c70e181865356c873ff403d4d03699c811963d425c54cc10bc8ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-gurmukhi"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
