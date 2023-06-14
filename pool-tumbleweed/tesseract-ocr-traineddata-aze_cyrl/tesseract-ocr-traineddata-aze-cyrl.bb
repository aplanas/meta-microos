SUMMARY = "Azerbaijani (Cyrillic) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Azerbaijani (Cyrillic) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-aze_cyrl-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "36da253850ab9cad688205fc79f78ce48a7d6b71d077fbfca2af817f7a64e1746c4eb2a983b973267a3cc835ca19ad14736bdd7ee1c25c7e1e9ea386717784b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-aze-cyrl \
tesseract-ocr-traineddata-azerbaijani-cyrillic \
tesseract-traineddata-azerbaijani-cyrillic"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
