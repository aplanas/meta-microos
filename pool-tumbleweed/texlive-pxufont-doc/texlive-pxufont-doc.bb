SUMMARY = "Documentation for texlive-pxufont"
DESCRIPTION = "This package includes the documentation for texlive-pxufont"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn64072"

RPM_NAME = "texlive-pxufont-doc-2023.201.0.0.6svn64072-53.2.noarch.rpm"
RPM_HASH = "fa4059434f5aab892c1046bffd63f0b41583a61fb461c0c5be25ba47a63d0fc6ff69660a82f79fef492b9613cfc99b4211f3801ef154692db7956af81c84d146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxufont-doc"

RDEPENDS:${PN} += ""

inherit rpm
