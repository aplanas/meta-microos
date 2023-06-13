SUMMARY = "Greek script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Greek script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-greek-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "332b6fea8a4bab2e5e114339a29046b0bc2b16e67ff7c87f09d4f475a763d34d9a096938916d6809bd5490e0bf8e6b0389fd60a97e8d2d4aac02824e69ee48dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-greek"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
