SUMMARY = "Kannada script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Kannada script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-kannada-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "63d12534882867782d2420c715c9dde72452faf030b3dfb62cb154a886e6c987afc0638315ae72bb1f96f9b60b7011997a553097f77af029f807e7a486d5b2b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-kannada"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
