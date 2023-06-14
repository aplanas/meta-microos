SUMMARY = "Serbian (Latin) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Serbian (Latin) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-srp_latn-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "c3ca838a00b5679666d78f9a9e0d05fbca718bc4101dbebfdd66a24b536f578aa87c42955768865a228987620bc0764754e4e3323761ad264a1524a5e7953982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-serbian-latin \
tesseract-ocr-traineddata-srp-latn \
tesseract-traineddata-serbian-latin"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
