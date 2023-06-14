SUMMARY = "Middle English (1100-1500) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Middle English (1100-1500) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-enm-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "7263e4d74139a41abdaa4cdf701cf69680b2a00737c18be16cd9a564a31c43c714e2c2614bda9f2064d06ce15864f50a6781ff8483c855727067eda80cce4919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-english-middle \
tesseract-ocr-traineddata-enm \
tesseract-traineddata-english-middle"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
