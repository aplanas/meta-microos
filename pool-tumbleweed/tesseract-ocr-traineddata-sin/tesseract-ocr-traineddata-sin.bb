SUMMARY = "Sinhala language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Sinhala language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-sin-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "796ab1f20fc1bfea63ab5385e785d0d3d4ca4ff7b11e7259098b280c3b35395dc832f1dd812df24db59ef712354f27fdfcd573df67f7c189a0ee34cd3f284b2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-sin \
tesseract-ocr-traineddata-sinhala \
tesseract-traineddata-sinhala"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
