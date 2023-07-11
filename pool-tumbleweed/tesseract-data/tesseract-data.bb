SUMMARY = "Data files for Tesseract"
DESCRIPTION = "This package provides the data files for the Tesseract game."
LICENSE = "Zlib"

PV = "2018_02_01"

RPM_NAME = "tesseract-data-2018_02_01-3.12.noarch.rpm"
RPM_HASH = "e9bd39d07994a3dde8c84c4deaf64b5a19f7ce4afbb99435e9785813a3f3b0f2e80071709969567d869ee862c90a5ec025c10e695cc531e7a6941d6789e7bb8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-data"

RDEPENDS:${PN} += "tesseract"

inherit rpm
