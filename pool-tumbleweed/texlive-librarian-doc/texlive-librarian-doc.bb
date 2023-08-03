SUMMARY = "Documentation for texlive-librarian"
DESCRIPTION = "This package includes the documentation for texlive-librarian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn19880"

RPM_NAME = "texlive-librarian-doc-2023.209.1.0svn19880-55.1.noarch.rpm"
RPM_HASH = "b410c2c8e091c054eac26afd0dd4dd7d7b2135711e7cee0420d5f279ef8c022800e1383638c9bd3f0ebb7c62d60e7581da04881a47894c474db085e87856edf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librarian-doc"

RDEPENDS:${PN} += ""

inherit rpm
