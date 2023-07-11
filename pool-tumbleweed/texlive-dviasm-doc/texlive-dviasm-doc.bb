SUMMARY = "Documentation for texlive-dviasm"
DESCRIPTION = "This package includes the documentation for texlive-dviasm"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64430"

RPM_NAME = "texlive-dviasm-doc-2023.201.svn64430-53.2.noarch.rpm"
RPM_HASH = "3096f6a858ff9eb5981b7b08780bbd877734e67906b0c1fd338ab23c40e468593b15a051833377479c6db6823bddbd835159334c2f156bef5ad1cdf114d0e9dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dviasm.1 \
texlive-dviasm-doc"

RDEPENDS:${PN} += ""

inherit rpm
