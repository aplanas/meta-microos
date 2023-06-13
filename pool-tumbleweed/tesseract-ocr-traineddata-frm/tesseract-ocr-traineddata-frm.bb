SUMMARY = "Middle French (ca. 1400-1600) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Middle French (ca. 1400-1600) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-frm-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "8baef183b02f0cbf7cfadacf109b90a1bd954947f3ac03fc7de16313790c8a8158c5fada06de1696a36a14765c21dbcb1d3df34d76d501085e331c0382366677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-french_middle \
tesseract-ocr-traineddata-frm \
tesseract-traineddata-french_middle"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
