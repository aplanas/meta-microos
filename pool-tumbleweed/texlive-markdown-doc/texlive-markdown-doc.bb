SUMMARY = "Documentation for texlive-markdown"
DESCRIPTION = "This package includes the documentation for texlive-markdown"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.21.0_0_gee15b88svn66257"

RPM_NAME = "texlive-markdown-doc-2023.201.2.21.0_0_gee15b88svn66257-52.1.noarch.rpm"
RPM_HASH = "40ced0edc4d461778eb5e35cb994bac81b7b6af5b7c864527fbff19f360126a9227f939a9d1229f24525e1d2b0006b6ac6f068756f6b6c5f38a3d4118c4f1d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-markdown-doc"
RDEPENDS:${PN} += ""

inherit rpm
