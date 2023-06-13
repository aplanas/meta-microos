SUMMARY = "Documentation for texlive-pst-jtree"
DESCRIPTION = "This package includes the documentation for texlive-pst-jtree"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn20946"

RPM_NAME = "texlive-pst-jtree-doc-2023.201.2.6svn20946-52.1.noarch.rpm"
RPM_HASH = "9677bdbb240a49bffb18df0e3a5a3f9822e82fead32822e3700388c86ae875ddc39b2bd6898047afd8c802d0de5767269066f1afdc63d3104a9a5a401fe6e466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-jtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
