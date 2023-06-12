SUMMARY = "Documentation for texlive-scrlayer-fancyhdr"
DESCRIPTION = "This package includes the documentation for texlive-scrlayer-fancyhdr"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.2svn63844"

RPM_NAME = "texlive-scrlayer-fancyhdr-doc-2023.201.0.0.2.2svn63844-53.1.noarch.rpm"
RPM_HASH = "6ac6e3dcc932ade93ad49ea57c9746c756d7d730f8b8dcd1745e2e5139af7ab61fcff6a78d679d7c12735bab886417b991cc19fafc715ebb81459366c8e82e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrlayer-fancyhdr-doc"
RDEPENDS:${PN} += ""

inherit rpm
