SUMMARY = "Cherokee language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Cherokee language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-chr-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "fd9cb3d037bcbdc10ba7acf8ab7275d5a30d8fbf0d169bbea7de810ddb8eb56f198b7a41946d94b977287b7a8ec377bba3f602f1d56978e3234d24cdd59d25a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-cherokee \
tesseract-ocr-traineddata-chr \
tesseract-traineddata-cherokee"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
