SUMMARY = "Arabic script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Arabic script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-arabic-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "872ecc23976d6f6027dd2cab8546ff1cdb3c92df981722137befe1b02088f89eaf0d2e86046c600cde160dd48e0af797aa360423142d26b8c1d2e217c63c6b83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-arabic"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
