SUMMARY = "Cyrillic script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Cyrillic script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-cyrillic-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "8d44ed4361d8aee2fb23ac1c7bf34b9e95a384798f19f81f48ace3840426c3eb154bb1ab85f5893d5edf63c9ae9d085550f59a5a31e8d1694b5a54570663d19f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-cyrillic"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
