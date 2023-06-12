SUMMARY = "Uzbek (Cyrillic) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Uzbek (Cyrillic) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-uzb_cyrl-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "d389756d16e6e524f43c830d842b81b7b0f5d4f61101b02f4d9c69dd6cf5557961b5d69b4f72f5c4a9435f9af7919616f6e28c5b5acb2b9c425376d18f25cb5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-uzb_cyrl \
tesseract-ocr-traineddata-uzbek_cyrillic \
tesseract-traineddata-uzbek_cyrillic"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
