SUMMARY = "Documentation for texlive-duotenzor"
DESCRIPTION = "This package includes the documentation for texlive-duotenzor"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn18728"

RPM_NAME = "texlive-duotenzor-doc-2023.209.1.00svn18728-53.1.noarch.rpm"
RPM_HASH = "e011dab59c3690e3a663f24f9c06b8db4405841daeda2f4c22875dd36fa26b52292ca6a7862d5d4169778c557358943c8752cad460e6ced2ca13268a1302682d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-duotenzor-doc"

RDEPENDS:${PN} += ""

inherit rpm
