SUMMARY = "Haitian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Haitian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-hat-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "e1daf25d3ed5cb5aa51efa6959f83540bb30e9355d019a89611b42eb7696f761aa8d855201fc33c476d6dad4760ab973ba03e3b90f04006fc20a102c13b0b69b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-haitian \
tesseract-ocr-traineddata-hat \
tesseract-traineddata-haitian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
