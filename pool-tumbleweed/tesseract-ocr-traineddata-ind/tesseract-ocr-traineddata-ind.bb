SUMMARY = "Indonesian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Indonesian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ind-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "44159a28381bdfc0597a9e726265d0aa5fc9375399717a91414c21ec22d53449c06b70da92915dbedc4da716fc361acc253e8cf41c4afb0a5e868932527ee455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ind \
tesseract-ocr-traineddata-indonese \
tesseract-traineddata-indonese"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
