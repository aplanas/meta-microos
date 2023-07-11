SUMMARY = "Documentation for texlive-recorder-fingering"
DESCRIPTION = "This package includes the documentation for texlive-recorder-fingering"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn66008"

RPM_NAME = "texlive-recorder-fingering-doc-2023.201.1.1bsvn66008-53.2.noarch.rpm"
RPM_HASH = "c990cd7cc9e13d43f4c1b4d495c507f047ee5c21917fe9df9c0cec36dfce72f77df172035b146b035e3d7ce4707c37a115a1ea5d5e46c52569c2b70302879189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recorder-fingering-doc"

RDEPENDS:${PN} += ""

inherit rpm
