SUMMARY = "Documentation for texlive-plates"
DESCRIPTION = "This package includes the documentation for texlive-plates"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-plates-doc-2023.209.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "3baae955aeb13a72951d56c1421a005d562c7c5e962a8f2b98415b8580eb9ca0289bb6ac6be2b03621cd252beab1f21f216d6d5256e2fbe25391c449b435e637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plates-doc"

RDEPENDS:${PN} += ""

inherit rpm
