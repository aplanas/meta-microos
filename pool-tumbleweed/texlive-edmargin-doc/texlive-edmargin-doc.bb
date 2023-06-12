SUMMARY = "Documentation for texlive-edmargin"
DESCRIPTION = "This package includes the documentation for texlive-edmargin"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn27599"

RPM_NAME = "texlive-edmargin-doc-2023.201.1.2svn27599-53.1.noarch.rpm"
RPM_HASH = "4e08b6793e4f0894c88435f6b07eec7f52a7026b887d63615be5eb1005ebd8708f9b07696e21cfc77264d6f267d426e097881ba75c53efc3268a9989630103e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edmargin-doc"
RDEPENDS:${PN} += ""

inherit rpm
