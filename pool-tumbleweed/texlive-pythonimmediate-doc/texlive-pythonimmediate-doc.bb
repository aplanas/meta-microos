SUMMARY = "Documentation for texlive-pythonimmediate"
DESCRIPTION = "This package includes the documentation for texlive-pythonimmediate"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.0svn66461"

RPM_NAME = "texlive-pythonimmediate-doc-2023.209.0.0.4.0svn66461-54.1.noarch.rpm"
RPM_HASH = "4aab4e1059057c6213bc7f3a3bd0ca6532d937feaaa3e66fe0d8e729bd9d8ccac71ecd54ca559139d2af9badf07137f417b6598c79b36a9d41964d4fc1027f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythonimmediate-doc"

RDEPENDS:${PN} += ""

inherit rpm
