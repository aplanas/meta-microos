SUMMARY = "Documentation for texlive-iffont"
DESCRIPTION = "This package includes the documentation for texlive-iffont"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn38823"

RPM_NAME = "texlive-iffont-doc-2023.209.1.0.0svn38823-54.1.noarch.rpm"
RPM_HASH = "7f1c994897b9b0205a737aa28aaba512ce098e4465d2fbc2ac73d521e4bf0be0dd8c427289f257b8f9d15e137c7cfc7c68e839cbbbd344de290f079d69853e2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iffont-doc"

RDEPENDS:${PN} += ""

inherit rpm
