SUMMARY = "Han (Traditional, Vertical) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Han (Traditional, Vertical) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-hant_vert-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "2309e5238461832435f67fc253eb66ba57964f182c9dba1161bffe6e56d32cc55985b4e182458260b12156532a4c9dc24ca789fe15f7fa966002fe49f2dcb4c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hant-vert"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
