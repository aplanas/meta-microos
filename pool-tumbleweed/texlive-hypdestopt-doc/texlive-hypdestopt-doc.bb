SUMMARY = "Documentation for texlive-hypdestopt"
DESCRIPTION = "This package includes the documentation for texlive-hypdestopt"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.7svn56253"

RPM_NAME = "texlive-hypdestopt-doc-2023.208.2.7svn56253-53.1.noarch.rpm"
RPM_HASH = "6fd95949975fabbfe84c817a4ba2353c433013ec3d7b848a60ab5dd52bb1c331fcec276c65693fe472d0514751e0be792b033455023f157325249cfadb927a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hypdestopt-doc-en \
texlive-hypdestopt-doc"

RDEPENDS:${PN} += ""

inherit rpm
