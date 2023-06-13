SUMMARY = "Maltese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Maltese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-mlt-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "1904544fa2422f43818ea249d961c42c27319a49dda1e4941d838377f0602bf55e6443c91fbc3902233fe1206f17120e2e7cda4b70186ae8744858cc9bf28d69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-maltese \
tesseract-ocr-traineddata-mlt \
tesseract-traineddata-maltese"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
