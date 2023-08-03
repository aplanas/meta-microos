SUMMARY = "Documentation for texlive-path"
DESCRIPTION = "This package includes the documentation for texlive-path"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.05svn22045"

RPM_NAME = "texlive-path-doc-2023.209.3.05svn22045-52.1.noarch.rpm"
RPM_HASH = "1afd94990b17dfcda2dd0103c49f6d9da1dc4f5536eb59c932202e9dcadcd24095aef6e9addfb3d0aa9adf22b1104e3e8ca73eb5e1c883baa6f68f19a3b1524d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-path-doc"

RDEPENDS:${PN} += ""

inherit rpm
