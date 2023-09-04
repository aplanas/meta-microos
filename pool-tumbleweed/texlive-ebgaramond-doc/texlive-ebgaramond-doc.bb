SUMMARY = "Documentation for texlive-ebgaramond"
DESCRIPTION = "This package includes the documentation for texlive-ebgaramond"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64343"

RPM_NAME = "texlive-ebgaramond-doc-2023.209.svn64343-54.2.noarch.rpm"
RPM_HASH = "47e07c890debf9636a3097ae2f5fcf3c6d621e2be5b256bf7d78559d1d7fdbabab50c751d3d335db775776852f95a1eb6dcc39a1ec041e2634b627e1de795101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebgaramond-doc"

RDEPENDS:${PN} += ""

inherit rpm
