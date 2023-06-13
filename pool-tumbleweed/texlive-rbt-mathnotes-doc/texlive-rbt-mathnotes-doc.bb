SUMMARY = "Documentation for texlive-rbt-mathnotes"
DESCRIPTION = "This package includes the documentation for texlive-rbt-mathnotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn61193"

RPM_NAME = "texlive-rbt-mathnotes-doc-2023.201.1.0.2svn61193-53.1.noarch.rpm"
RPM_HASH = "c10820e110f4d43605ca35be5ff93b018f4b40bc2276077a5e5c67337b83e38365ba18e1eca04a3bd4d7f8f8e82e786b3fcb4803b48bb9d2ebb437e73fca863a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rbt-mathnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
