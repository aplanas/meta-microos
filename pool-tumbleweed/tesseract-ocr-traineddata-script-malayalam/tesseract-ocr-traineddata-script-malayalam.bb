SUMMARY = "Malayalam script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Malayalam script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-malayalam-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "7f3ba9cc4e296e358ba6e86409a3231285f6605d9b7731a08230bdb0073311e5ff5b90e5cbdba6e5c0ffe3e405d4542d2ba31059d4b38c1026b7b82858d12006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-malayalam"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
