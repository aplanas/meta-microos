SUMMARY = "'Korean language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the 'Korean language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-kor_vert-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "e3d04d6023e2e27b24d01524ec0930f41a94e753c361178028e49bb7afe88cb0d7b36f09e21f96535671cf8bdd710df1e895522c29bb2539ed3e029e7de56e8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-kor_vert \
tesseract-ocr-traineddata-korean_vertical \
tesseract-traineddata-korean_vertical"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
