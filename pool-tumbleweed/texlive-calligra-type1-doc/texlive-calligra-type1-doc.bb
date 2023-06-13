SUMMARY = "Documentation for texlive-calligra-type1"
DESCRIPTION = "This package includes the documentation for texlive-calligra-type1"
LICENSE = "LPPL-1.0"

PV = "2023.201.001.000svn24302"

RPM_NAME = "texlive-calligra-type1-doc-2023.201.001.000svn24302-52.1.noarch.rpm"
RPM_HASH = "499b775660d342aaac860f1f9ec4cd3134966eb7fce67d023f422368dcf5fcb9ff8dd4ad1c302b6903e8fe324c84061be6ec5a9c0db704eaf68b9f7aee518c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calligra-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
