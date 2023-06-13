SUMMARY = "Ancient Greek language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Ancient Greek language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-grc-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "ae7c95df9a2cf63dc2c2aee4aa803c0f816b0791137ec002f08085afbbb545f3d225956190884e0447ae231a7fec36bce2faf071bb3540897f9175ebbca01a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-grc \
tesseract-ocr-traineddata-greek_ancient \
tesseract-traineddata-greek_ancient"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
