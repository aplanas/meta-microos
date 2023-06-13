SUMMARY = "French language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the French language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-fra-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "425c27dfd354be520d4c6f255ec8435fed44aec0b628bf0acd539c16dd790abbcb7016af87c3d51b0716bdefe914f12a43e68977257babcc818f1301150b9c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-fra \
tesseract-ocr-traineddata-french \
tesseract-traineddata-french"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
