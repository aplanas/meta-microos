SUMMARY = "Documentation for texlive-pgfmolbio"
DESCRIPTION = "This package includes the documentation for texlive-pgfmolbio"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21svn35152"

RPM_NAME = "texlive-pgfmolbio-doc-2023.201.0.0.21svn35152-51.1.noarch.rpm"
RPM_HASH = "39efe1dc5f7e11e8701afc87ef22afbe64c7195c92387185bc05975d111d44ff9a68aa8b2dc914eeac558b1b5f6d2c4a2b5a9eaef78afb1da569c86157552a2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfmolbio-doc"

RDEPENDS:${PN} += ""

inherit rpm
