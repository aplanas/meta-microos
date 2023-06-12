SUMMARY = "Latin script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Latin script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-latin-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "98199e8f1f5aeb3ff1d7a85d55ffd2cbb651d7a27ab33f70656a20788a84ed1699d7255c0c0307fc3d686b8d30e206595573a0bf54b9e7e124438960e94de1b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-latin"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
