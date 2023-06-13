SUMMARY = "Lao script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Lao script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-lao-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "89f72042a0c8fc1fd4b8a9aaf0fbe81a760e22cf5ba0610345677fe2bf668c21fe96ef9527bec0ef67de7161f90e31256aa8124549a059b5fa49d9f675a88875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-lao"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
