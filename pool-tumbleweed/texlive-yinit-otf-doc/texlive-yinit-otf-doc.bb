SUMMARY = "Documentation for texlive-yinit-otf"
DESCRIPTION = "This package includes the documentation for texlive-yinit-otf"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-doc-2023.201.1.0svn40207-52.2.noarch.rpm"
RPM_HASH = "dc00815e10f2a6cf916607d1b7210b1c12c575ac10e3287f129050049e6bd0d5ed9a18d89c0cc6af9b7c9521bee40d12fa644581f514ac7fedf71826bca25a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yinit-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
