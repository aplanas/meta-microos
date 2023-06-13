SUMMARY = "Documentation for texlive-substr"
DESCRIPTION = "This package includes the documentation for texlive-substr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn16117"

RPM_NAME = "texlive-substr-doc-2023.201.1.2svn16117-57.1.noarch.rpm"
RPM_HASH = "1a70f248251892c5c739586a68a5ee2d89d29e181c1d831051b7a7bd0684b4e926e3e4386525c71187db374711bdd7dfcbcbe3703784f6e3d49d9fb7d8af91b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-substr-doc"

RDEPENDS:${PN} += ""

inherit rpm
