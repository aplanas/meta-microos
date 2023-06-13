SUMMARY = "Documentation for texlive-invoice-class"
DESCRIPTION = "This package includes the documentation for texlive-invoice-class"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn49749"

RPM_NAME = "texlive-invoice-class-doc-2023.201.1.0svn49749-52.1.noarch.rpm"
RPM_HASH = "d5ff5a5443465d5df45c497b16b4d5fbd5db6f48b744d39c5c70d5ded4553ce87895cc5f258197eeea94ba575f76afd31d28492921a011767aa0923d21474ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-invoice-class-doc"

RDEPENDS:${PN} += ""

inherit rpm
