SUMMARY = "Documentation for texlive-mlacls"
DESCRIPTION = "This package includes the documentation for texlive-mlacls"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn60508"

RPM_NAME = "texlive-mlacls-doc-2023.209.1.0svn60508-55.1.noarch.rpm"
RPM_HASH = "6f4f1619b59dfe62aea715503b7e0dc57a01b90e654a0192540b9224a4d157e021400cef86cf2636d2c5fd1197cc6dd04306819efeeb53ffa25de49dbd4a893d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mlacls-doc"

RDEPENDS:${PN} += ""

inherit rpm
