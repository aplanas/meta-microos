SUMMARY = "Slovakian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Slovakian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-slk-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "ebd9cb7de183af44b36611f11397239b09d61551ed4697c1bdbf15c7695a565b830094468ae9a58bdd439aba9b7b07df8c4178b71accd3860ead63469a07447a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-slk \
tesseract-ocr-traineddata-slovak \
tesseract-traineddata-slovak"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
