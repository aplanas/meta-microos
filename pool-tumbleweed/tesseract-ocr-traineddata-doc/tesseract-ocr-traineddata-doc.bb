SUMMARY = "Documentation for tesseract-ocr-traineddata"
DESCRIPTION = "The tesseract-ocr-traineddata-doc package contains the documentation for tesseract-ocr-traineddata."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-doc-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "4d39bb763f076e3013c2ad8087c6be3c4386bda294fa469253af70dc9dbfd81a6fa90feff1af6e00aea8c4a6d8842f4241ded7a869fce1a9ab37aaaaa2c0332c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-doc"

RDEPENDS:${PN} += ""

inherit rpm
