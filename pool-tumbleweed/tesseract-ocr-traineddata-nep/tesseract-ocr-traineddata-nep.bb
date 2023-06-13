SUMMARY = "Nepali language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Nepali language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-nep-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "da7db7b7535dc028b70a7c8bb2802a88f6b0473c0c20bb628293158d30fe12b98328bb4a3cde25f73caa2bb8e08bd38e657f6f7ae6b712af647bcb2c28213413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-nep \
tesseract-ocr-traineddata-nepali \
tesseract-traineddata-nepali"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
