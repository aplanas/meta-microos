SUMMARY = "Urdu language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Urdu language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-urd-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "1fe39dac5deec8e5b60d5f863c6e0f06366018d754eb3b791ac980862273e6add2e272d367dc8467f006c186abaff209b2078a284d23b6807c8d73a49eaded14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-urd \
tesseract-ocr-traineddata-urdu \
tesseract-traineddata-urdu"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
