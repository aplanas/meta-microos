SUMMARY = "Portuguese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Portuguese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-por-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "017670041a66322622838c2a44c40bad54279c117f6899ee4bd8f6727e4b630c7edc0b565b87efee96387e0f9e889cf33b4c660eed5530d3575f22beac018d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-por \
tesseract-ocr-traineddata-portuguese \
tesseract-traineddata-portuguese"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
