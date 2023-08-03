SUMMARY = "Documentation for texlive-tikz-swigs"
DESCRIPTION = "This package includes the documentation for texlive-tikz-swigs"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59889"

RPM_NAME = "texlive-tikz-swigs-doc-2023.209.svn59889-53.1.noarch.rpm"
RPM_HASH = "f38e7a1dd28ad6169418d821ea46bdb09b256c4ad95b6f2a26f28f568d8c90a38ad69a99800cc3d1a8ed78865f55bab7bebfc76274b77a5a2f834216486328f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-swigs-doc"

RDEPENDS:${PN} += ""

inherit rpm
