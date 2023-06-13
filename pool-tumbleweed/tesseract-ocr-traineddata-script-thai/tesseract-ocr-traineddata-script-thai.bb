SUMMARY = "Thai script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Thai script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-thai-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "f47f07bd2698b390408f09f2ea06618824229e445562353a90be1fa5659c2ded8e3921af69cebe893dadf528a93723d28c60b579de2b31c513fbd8e9a0eb1749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-thai"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
