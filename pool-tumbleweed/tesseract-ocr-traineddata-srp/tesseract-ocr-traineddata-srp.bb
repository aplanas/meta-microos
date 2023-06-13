SUMMARY = "Serbian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Serbian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-srp-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "4ed244af4ec3a3ec36c7173ec8804ca42bb19c6d1e3b9ddb415bcc1c12eec45f2d9b1499db5de90a13b471dc0f65d79d1a9ef4bb8d32cdec848be61551727746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-serbian \
tesseract-ocr-traineddata-srp \
tesseract-traineddata-serbian"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
