SUMMARY = "Chinese (Traditional, Vertical) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Chinese (Traditional, Vertical) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-chi_tra_vert-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "8b13950404952c064904dc5052177c88959d15a7ee377f2d8674b5e7ffedb3e4a8c771e533a0d391cacc83b8584b58fc06e2f4da855f5417706af5edcf6955e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-chi_tra_vert \
tesseract-ocr-traineddata-chinese_traditional_vertical \
tesseract-traineddata-chinese_traditional_vertical"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
