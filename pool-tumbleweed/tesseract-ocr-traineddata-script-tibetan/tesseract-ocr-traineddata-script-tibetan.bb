SUMMARY = "Tibetan script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tibetan script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-tibetan-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "c98d5ed654b45b8f55b997cac89f0302e82d5d9eb8c64b0d7cfd22a456bec1881c5c588010803f7e4387cd6a993edb1c01fc39808b5946e3e88f756b29fdec30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-tibetan"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
