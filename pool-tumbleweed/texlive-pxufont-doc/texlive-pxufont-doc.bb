SUMMARY = "Documentation for texlive-pxufont"
DESCRIPTION = "This package includes the documentation for texlive-pxufont"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn64072"

RPM_NAME = "texlive-pxufont-doc-2023.201.0.0.6svn64072-53.1.noarch.rpm"
RPM_HASH = "6d6cf8079a1815c47efb8a85ca6974ee1732293abbd9600cced905b0c46a2c3238e8bc0c43427cd6bef3c4f2a464be5289c394f76cf087e525e65ed7e7ccad95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxufont-doc"
RDEPENDS:${PN} += ""

inherit rpm
