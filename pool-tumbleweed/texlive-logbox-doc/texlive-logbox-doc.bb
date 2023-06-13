SUMMARY = "Documentation for texlive-logbox"
DESCRIPTION = "This package includes the documentation for texlive-logbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24499"

RPM_NAME = "texlive-logbox-doc-2023.201.1.0svn24499-54.1.noarch.rpm"
RPM_HASH = "662017abe929adffd88f5716ad24b071f7d5d132f7fdf028ba48afd36c589c1c3eafaea425f84fae61ee72c1252c1bddff6631f47d043f3eb7aeb5abadd29141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
