SUMMARY = "Myanmar script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Myanmar script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-myanmar-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "0aff7aad6afe96c89526e01dfe8f9e6c4cdd971205113c606aff4704625c1e3cf5f53d7f88d9174db7748e149e9cf1c83c075651553472c540fcefb98883f1d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-myanmar"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
