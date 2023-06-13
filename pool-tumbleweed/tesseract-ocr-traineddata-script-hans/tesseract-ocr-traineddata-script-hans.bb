SUMMARY = "Han (Simplified) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Han (Simplified) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-hans-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "da7e3a434690f279e35e330c1c58a90150ca5d20bee3aea5e0daec86a26fcee01ab36b5a11d7608256c99223c564483d23a27e2a9334f91425d759eb33b34fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hans"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
