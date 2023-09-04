SUMMARY = "Documentation for texlive-revtex"
DESCRIPTION = "This package includes the documentation for texlive-revtex"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2esvn56591"

RPM_NAME = "texlive-revtex-doc-2023.209.4.2esvn56591-54.2.noarch.rpm"
RPM_HASH = "549351ea65219b99ae443f9e5d96d93b70b9cf51907b59ec8ce0d6252e334d739adae0b0e387db2afb3face11e88ab5d74a676203552d9189b919bed41a55802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
