SUMMARY = "Data files for Tesseract"
DESCRIPTION = "This package provides the data files for the Tesseract game."
LICENSE = "Zlib"

PV = "2018_02_01"

RPM_NAME = "tesseract-data-2018_02_01-3.11.noarch.rpm"
RPM_HASH = "5f66a7fb071e6486442962e11a230f4dcf35f88570a4f877a4193cf4b5ccba9dc539c7732414de81718c5098945fb9388862ab342eeefbae8a913e0cafc7f1e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-data"

RDEPENDS:${PN} += "tesseract"

inherit rpm
