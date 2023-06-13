SUMMARY = "Georgian script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Georgian script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-georgian-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "5a04ba9e803cd372e47479121b35c01b51ba554d379833706d817a7f3e7eae52729a912e433471bcc40fecbdb5490344686eac4c558cac7ec662d0e4103895d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-georgian"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
