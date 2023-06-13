SUMMARY = "Documentation for texlive-fetamont"
DESCRIPTION = "This package includes the documentation for texlive-fetamont"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn43812"

RPM_NAME = "texlive-fetamont-doc-2023.201.svn43812-52.1.noarch.rpm"
RPM_HASH = "e6843630f7629725bef7926103794f1744fcf66a61129d67e316a4f262cad3de41c7a51f2c2e029f3139f31e1f40e1b767928ed583d8ebf835ccaab2da81548e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fetamont-doc"

RDEPENDS:${PN} += ""

inherit rpm
