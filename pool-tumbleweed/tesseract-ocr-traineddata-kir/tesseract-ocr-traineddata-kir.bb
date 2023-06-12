SUMMARY = "Kyrgyz language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Kyrgyz language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-kir-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "11f6dfd2572beb63f2bd2c9d959ee391a559f467202a22cd55fb44b4465fc45fd09d4f0824295abce5b91cd5829c1c7627b82c7fcf69fe2a945768f1f65efdbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-kir \
tesseract-ocr-traineddata-kyrgyz \
tesseract-traineddata-kyrgyz"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
