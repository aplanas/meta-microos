SUMMARY = "Oriya script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Oriya script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-oriya-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "79e2487fc7a46f2da3c21b2ee555ff3ac238de3d3bb4ce3e97571253a754daff68f9eb4b3c6039780371a5df276670082bfa39c84735d156bee87cd257d4dbff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-oriya"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
