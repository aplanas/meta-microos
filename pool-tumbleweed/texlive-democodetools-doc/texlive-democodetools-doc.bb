SUMMARY = "Documentation for texlive-democodetools"
DESCRIPTION = "This package includes the documentation for texlive-democodetools"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1betasvn64314"

RPM_NAME = "texlive-democodetools-doc-2023.209.1.0.1betasvn64314-53.1.noarch.rpm"
RPM_HASH = "5e8ef9468e22c3d6233feee3510731fd75340a98794c6cf870926e615d1d30de91dbea8586673f6e238134f17b37b0ca04c41a6643d3e2da80eb378cbcf267f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-democodetools-doc"

RDEPENDS:${PN} += ""

inherit rpm
