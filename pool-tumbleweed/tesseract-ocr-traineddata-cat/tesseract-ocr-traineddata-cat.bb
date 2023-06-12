SUMMARY = "Catalan language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Catalan language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-cat-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "c7df7c623e35832b677ed2e257e9910c3774dbb59b9cbe3055b3f0b51d72046014af96df00e1d3ce628a2d39f116dc896a14afa781fd8f2cb1d6410084d1d8a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-cat \
tesseract-ocr-traineddata-catalan \
tesseract-traineddata-catalan"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
