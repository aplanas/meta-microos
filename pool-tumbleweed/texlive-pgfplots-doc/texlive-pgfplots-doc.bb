SUMMARY = "Documentation for texlive-pgfplots"
DESCRIPTION = "This package includes the documentation for texlive-pgfplots"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.18.1svn61719"

RPM_NAME = "texlive-pgfplots-doc-2023.201.1.18.1svn61719-51.1.noarch.rpm"
RPM_HASH = "e8144f90d64538acb9b5e96a45322c2ba98b45e83706bd702a5f12e5b3722b477556aea0a697e0be456fe84b7e740610bcbab406eff25022135504c97323ec76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfplots-doc"

RDEPENDS:${PN} += ""

inherit rpm
