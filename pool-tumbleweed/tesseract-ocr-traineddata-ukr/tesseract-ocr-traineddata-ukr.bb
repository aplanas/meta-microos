SUMMARY = "Ukrainian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Ukrainian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ukr-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "acda8ccf95f36cb6169ca03d136e7e1bcf485f8206d935ac74ea1e173714f61351a784d924b13f218abadbc7129832f4de60869f67f400fb0b57de9912d65310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ukr \
tesseract-ocr-traineddata-ukrainian \
tesseract-traineddata-ukrainian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
