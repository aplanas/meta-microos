SUMMARY = "Italian (Old) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Italian (Old) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ita_old-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "91981472b976bca1e03d1eaa2a89f7fca1343c5b8fe42b8867cff19a4859a122fefa48931704aeb52596b7afdc20477f21362016b99f0856fe83cf2124038eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ita_old \
tesseract-ocr-traineddata-italian_old \
tesseract-traineddata-italian_old"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
