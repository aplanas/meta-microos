SUMMARY = "Japanese (Vertical) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Japanese (Vertical) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-japanese_vert-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "a05bfef97d2f40fa5e2d3e1f940f59fbf31676f81f6029cf046f2fc13e494b8056b2b27ca0358fc812c3394cb102aa5ac4a57ada8184376dc46fcd04acca044d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-japanese-vert"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
