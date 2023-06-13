SUMMARY = "Sundanese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Sundanese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-sun-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "b413780b5d9a771bfd90c1a0c954a717e526eed0cd9937508618f44715faf7e8fd57aa524f909f311cd6e8f51ee5ec4b4ab329c8e719204f591e112fd0687116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-sun \
tesseract-ocr-traineddata-sundanese \
tesseract-traineddata-sundanese"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
