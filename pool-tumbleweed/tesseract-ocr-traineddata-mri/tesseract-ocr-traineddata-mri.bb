SUMMARY = "Maori language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Maori language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-mri-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "ed13bccd7daebbaf88b973a7208b08bf6fbae7e9e2cc178e8f01f022c69029a7ce1b68821efb95d7c1ff819b39c2b6d153a21083b52bd450dcdd3ebea6bcdd0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-maori \
tesseract-ocr-traineddata-mri \
tesseract-traineddata-maori"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
