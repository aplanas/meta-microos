SUMMARY = "Croatian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Croatian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-hrv-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "998ae54c1632c99148fa295388e4bfdafae9856671f1f7460a0069cd9fac793d588d44916f5c33afab5c00bf5ecf99f23f00c4085946e5e95fb93be642e0404f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-croatian \
tesseract-ocr-traineddata-hrv \
tesseract-traineddata-croatian"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
