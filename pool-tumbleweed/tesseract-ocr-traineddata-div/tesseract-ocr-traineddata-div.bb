SUMMARY = "Dhivehi; Maldivian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Dhivehi; Maldivian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-div-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "237e623f39efd9d8641db9f8883133765c23be7e0d09885727fb2ffcab2961ac627c063d400d79ac95c1a48cd19c0f13f69430ca5d4bfd64609cc29ab356d068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-dhivehi \
tesseract-ocr-traineddata-div \
tesseract-traineddata-dhivehi"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
