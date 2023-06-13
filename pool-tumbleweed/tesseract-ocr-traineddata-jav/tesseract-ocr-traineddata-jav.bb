SUMMARY = "Javanese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Javanese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-jav-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "1c1ec5c65deca90366461c3f5ba6518419bfca3c284dd91c64b1b58bf72a1781d4c65ecc7b55322a84f1d1abedfcc0d1c54b99afaa51116472b98800c69b397f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-jav \
tesseract-ocr-traineddata-javanese \
tesseract-traineddata-javanese"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
