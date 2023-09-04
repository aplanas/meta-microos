SUMMARY = "Documentation for texlive-zhnumber"
DESCRIPTION = "This package includes the documentation for texlive-zhnumber"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn66115"

RPM_NAME = "texlive-zhnumber-doc-2023.209.3.0svn66115-53.2.noarch.rpm"
RPM_HASH = "067fb3c887c44e2bd7ba147bea468e2c83a42faaa4892f6b61a100a8e717de5e4f1ee7cd29d3991bce6cf6a0e24fa409ae4c30783c7a486698398959b2809c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zhnumber-doc-zh \
texlive-zhnumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
