SUMMARY = "Thai language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Thai language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-tha-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "1c9d949724ee9c28f5ec608eae90f4c94a029bd917a5f1de274f9bfc5e4d3102f08c2985e7b1bde0089d4a01925cfee3c9833e6cb593458c71c9f62e8040d912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-tha \
tesseract-ocr-traineddata-thai \
tesseract-traineddata-thai"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
