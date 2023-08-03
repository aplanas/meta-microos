SUMMARY = "Documentation for texlive-multido"
DESCRIPTION = "This package includes the documentation for texlive-multido"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.42svn18302"

RPM_NAME = "texlive-multido-doc-2023.209.1.42svn18302-55.1.noarch.rpm"
RPM_HASH = "d3b7f02c1b2b7c1cd5f9b9ba51ae41835f8f926568d7443b42a2e0c850c5eaa4b8c8c70e251b4e5ad4e5f50c86e99430004a39509192f189b8cb91fd162cd975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multido-doc"

RDEPENDS:${PN} += ""

inherit rpm
