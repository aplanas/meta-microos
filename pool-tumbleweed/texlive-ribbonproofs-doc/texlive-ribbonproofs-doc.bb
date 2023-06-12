SUMMARY = "Documentation for texlive-ribbonproofs"
DESCRIPTION = "This package includes the documentation for texlive-ribbonproofs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn31137"

RPM_NAME = "texlive-ribbonproofs-doc-2023.201.1.0svn31137-53.1.noarch.rpm"
RPM_HASH = "353a2cfd1a16f72f7482f040b4694c9b274efdee6f6e35b610e3163ec3d61f033007d04306de17a9f9c11368e990c804af7ff4ccefcfd6ad2b792c8dc8b7390c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ribbonproofs-doc"
RDEPENDS:${PN} += ""

inherit rpm
