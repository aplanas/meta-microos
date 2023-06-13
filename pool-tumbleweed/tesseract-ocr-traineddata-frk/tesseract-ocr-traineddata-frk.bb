SUMMARY = "Frankish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Frankish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-frk-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "327480a722da285ee41b6e0030901152d1b42f68328e882961bf185261c30243be4f65d8da3981a00f14b81d43a6f1f7ed0af1de0de3abb143e3f4ed4b41b638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-frankish \
tesseract-ocr-traineddata-frk \
tesseract-traineddata-frankish"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
