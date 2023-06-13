SUMMARY = "Tigrinya language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tigrinya language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-tir-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "fe60bb6529aeb4dd5ff7e05400573f23f7e98c074ce68de232b6a21c95263831696a1e08aa0112ca7f0a0a5b92203d1509df35ca9c43ebc72ddf2aa577ba3afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-tigrinya \
tesseract-ocr-traineddata-tir \
tesseract-traineddata-tigrinya"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
