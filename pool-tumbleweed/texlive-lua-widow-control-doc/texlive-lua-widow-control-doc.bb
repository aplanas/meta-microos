SUMMARY = "Documentation for texlive-lua-widow-control"
DESCRIPTION = "This package includes the documentation for texlive-lua-widow-control"
LICENSE = "LPPL-1.0"

PV = "2023.208.3.0.0svn65084"

RPM_NAME = "texlive-lua-widow-control-doc-2023.208.3.0.0svn65084-53.1.noarch.rpm"
RPM_HASH = "5cc4993bbf9d0a61230e1c3a5e05572554cc0bb2cabeac59c2bb20a89f30afaf947a1b28e4bc5e0c623822e0b3c3747bb01683ca4824ed7f4eeadc4465dbc95f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-widow-control-doc"

RDEPENDS:${PN} += ""

inherit rpm
