SUMMARY = "Documentation for texlive-cormorantgaramond"
DESCRIPTION = "This package includes the documentation for texlive-cormorantgaramond"
LICENSE = "OFL-1.1"

PV = "2023.209.3.601svn64411"

RPM_NAME = "texlive-cormorantgaramond-doc-2023.209.3.601svn64411-55.1.noarch.rpm"
RPM_HASH = "506eb7478f532ca92dd8b300f0ff7a51e0c331c43f6bac10d4a2bb357f20c088e1d0a3f1aaf1c7f36f3718cb69c980d46bf9222620b0f133f24723660bbad593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cormorantgaramond-doc"

RDEPENDS:${PN} += ""

inherit rpm
