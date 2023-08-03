SUMMARY = "Documentation for texlive-epigraph-keys"
DESCRIPTION = "This package includes the documentation for texlive-epigraph-keys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-epigraph-keys-doc-2023.209.1.0svn61719-54.1.noarch.rpm"
RPM_HASH = "5e6b5ad697140e12f2556859a90ed46ee28e7ad971a0060aca9e4cff071da4bacf724869579135d9dea6c3c47da45dd470f636dbabfded1a43bfd5c4117fe122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigraph-keys-doc"

RDEPENDS:${PN} += ""

inherit rpm
