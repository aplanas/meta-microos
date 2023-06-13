SUMMARY = "Georgian (Old) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Georgian (Old) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-kat_old-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "dfe528bf81d48374b5c850277b19b317fb60599190faf638d8f4ca0b0a638c722d22c53baf0d54cbc8b7ccf871e3e83257783a37b2322ef6815db774ad976664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-georgian_old \
tesseract-ocr-traineddata-kat_old \
tesseract-traineddata-georgian_old"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
