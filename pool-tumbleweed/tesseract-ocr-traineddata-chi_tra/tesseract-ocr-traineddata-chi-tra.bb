SUMMARY = "Chinese (Traditional) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Chinese (Traditional) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-chi_tra-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "a17e953151323ec217fe4587df4f72e6e5aed50a398ce1bcb7e21abd37845b7ba7b904b10cd59a78463787b910204d81de5c8f12aa53ac3ff0d269e8eac3a838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-chi-tra \
tesseract-ocr-traineddata-chinese-traditional \
tesseract-traineddata-chinese-traditional"

RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
