SUMMARY = "Documentation for texlive-kpfonts-otf"
DESCRIPTION = "This package includes the documentation for texlive-kpfonts-otf"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.48svn65560"

RPM_NAME = "texlive-kpfonts-otf-doc-2023.201.0.0.48svn65560-55.1.noarch.rpm"
RPM_HASH = "2504f35979e219dc17b515ae8fa78aa2f9b6b741e7d5949e85547d0f3281cad7ef315309f1ea0cdd85f8c811fc3203a6991cbf637628afd49031238eb7f824db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kpfonts-otf-doc-en;fr \
texlive-kpfonts-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
