SUMMARY = "Documentation for texlive-rcsinfo"
DESCRIPTION = "This package includes the documentation for texlive-rcsinfo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11svn15878"

RPM_NAME = "texlive-rcsinfo-doc-2023.201.1.11svn15878-53.2.noarch.rpm"
RPM_HASH = "532e1f2cdd4efdc76d0a8fe40f846d0f16508d9134d6402e32b263ffaa9ff87846577fd1a50c5b55832b15ff5e28251510db076f2d9198501c51a08d2119c7fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcsinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
