SUMMARY = "Chinese (Simplified) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Chinese (Simplified) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-chi_sim-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "0627e8efe59ea8d7ad89b46e8aaa79bac3a5f76c609702ab0d3cb29b77719681319ab811bcf67877e5110846c6d6916dc5347bdac44d752716231ca0ad498b78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-chi_sim \
tesseract-ocr-traineddata-chinese_simplified \
tesseract-traineddata-chinese_simplified"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
