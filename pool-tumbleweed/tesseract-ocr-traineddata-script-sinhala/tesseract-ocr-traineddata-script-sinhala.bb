SUMMARY = "Sinhala script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Sinhala script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-sinhala-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "a9d842a3696894111fa1aa54d71e2e9de53d323d3a144591f401709612daf1bc2cb623d51a53b0e052eb2c9152a5a44e5332241bf6cd8b1e570831c82086ee72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-sinhala"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
