SUMMARY = "Japanese script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Japanese script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-japanese-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "01dd78fa06a55c723ae54727f7d625760c912c5775ca1fa749d5239b229ef7baec1ea51ac2eebd5502c7b659eb9cf04e86296f25ca7046e7b9fb8cc3c2236287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-japanese"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
