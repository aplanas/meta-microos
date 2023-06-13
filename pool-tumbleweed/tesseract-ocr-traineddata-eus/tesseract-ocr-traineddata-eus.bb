SUMMARY = "Basque language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Basque language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-eus-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "2e9a93e3381ec5616f24b44acc7698202d90eea4767c6e8d75ea1972d82737c3386ec03b094d617c1d8d692b786e0b22b69372c5e02c97736a186d8a82ac5e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-basque \
tesseract-ocr-traineddata-eus \
tesseract-traineddata-basque"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
