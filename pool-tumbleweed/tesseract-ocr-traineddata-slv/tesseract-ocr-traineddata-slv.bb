SUMMARY = "Slovenian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Slovenian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-slv-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "2df92b404f8abceae971e49851bdfcbb7698eb767ddb30598771d7b3cabab3e137e5e364152ab8f89959f9d8eb98fbc50517904cc702b5aa08e21ffa1989b2b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-slovenian \
tesseract-ocr-traineddata-slv \
tesseract-traineddata-slovenian"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
