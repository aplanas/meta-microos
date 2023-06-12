SUMMARY = "Turkish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Turkish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-tur-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "8dfd653f33d0ea7f8665ab5249197cad7215007d3913c92e9b0578c39266c3b8a0b47991b3f8a02cabdca71719cf489b7bc16ba0f6d8b3ffe3eeafe4c170365c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-tur \
tesseract-ocr-traineddata-turkish \
tesseract-traineddata-turkish"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
