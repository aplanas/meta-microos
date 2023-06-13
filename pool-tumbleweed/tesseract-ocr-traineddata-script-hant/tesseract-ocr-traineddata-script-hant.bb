SUMMARY = "Han (Traditional) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Han (Traditional) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-hant-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "284a46533e4081933f9e13b7d9eba58d6d1841b9f3ec38c69ddbea32366972a7ceff22541acef14bf1f56da9a86d3748cf180a5a00b6846d97f731633ad0337d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hant"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
