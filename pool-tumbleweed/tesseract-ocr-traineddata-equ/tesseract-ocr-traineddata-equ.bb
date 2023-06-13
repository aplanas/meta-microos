SUMMARY = "Orientation & Script Detection Data for tesseract"
DESCRIPTION = "Math equation data for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-equ-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "bc9d8c23391e8f3cda1ac93f01032b4c8bd8ee4fa6981f09cdfc4d2e2e93f94813d04b5f7db64652d2223da99cb77923bd64dbb4df377ee303a114ec85de03e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-equ \
tesseract-ocr-traineddata-math_equation"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
