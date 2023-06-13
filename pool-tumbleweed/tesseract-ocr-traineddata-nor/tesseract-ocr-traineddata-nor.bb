SUMMARY = "Norwegian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Norwegian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-nor-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "09476e5fd2283a526031a6924560c775c27fbe5dfc2460e9f7c2165603cc939a4141fcc51ed43e623afba86fa912487541f86a73be91b408a304a95b32688392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-nor \
tesseract-ocr-traineddata-norwegian \
tesseract-traineddata-norwegian"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
