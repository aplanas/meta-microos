SUMMARY = "Documentation for texlive-ecgdraw"
DESCRIPTION = "This package includes the documentation for texlive-ecgdraw"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn41617"

RPM_NAME = "texlive-ecgdraw-doc-2023.209.0.0.1svn41617-54.2.noarch.rpm"
RPM_HASH = "638e15f1960cd8dcd66b2285be7e58ff1bc966fc9a1b3bb954d0515dd7269b84ba754bf399fde13e2cdcbbe42e5ab030023001965b3880f3a8101cf3c8b5810c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ecgdraw-doc-it \
texlive-ecgdraw-doc"

RDEPENDS:${PN} += ""

inherit rpm
