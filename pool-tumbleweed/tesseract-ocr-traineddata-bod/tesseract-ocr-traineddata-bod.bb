SUMMARY = "Tibetan (Standard) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tibetan (Standard) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-bod-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "475f167bb669cfa944e22d7d63e40f87cfcd564bdde0b02e17e4e9f53dba763ed13934c0f815f1ccb1616e62b327d4281ed0eff65ab227985e8d6209ff732127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-bod \
tesseract-ocr-traineddata-tibetan-standard \
tesseract-traineddata-tibetan-standard"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
