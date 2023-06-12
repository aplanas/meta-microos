SUMMARY = "Marathi language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Marathi language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-mar-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "dd0001918098593b109cf93ed189852c1630f563b697e7a91e1d233199197a8ebb9bc6df50cef0331017b5e6563c699fabd8dae3620e67b584925d6f57675c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-mar \
tesseract-ocr-traineddata-marathi \
tesseract-traineddata-marathi"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
