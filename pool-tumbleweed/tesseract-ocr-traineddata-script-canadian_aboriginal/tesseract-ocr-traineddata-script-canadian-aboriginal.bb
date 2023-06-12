SUMMARY = "Canadian (Aboriginal) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Canadian (Aboriginal) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-canadian_aboriginal-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "a4a2eec6d6fdff45b765260761d2e3bf25e6e22c8b7e9810c1a2edd4776c266eb2f993cf973ab17243d8411710ecfb4728dc9609f0512b10afc53b65a3e2ac1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-canadian_aboriginal"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
