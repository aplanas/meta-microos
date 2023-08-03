SUMMARY = "Documentation for texlive-plex"
DESCRIPTION = "This package includes the documentation for texlive-plex"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64496"

RPM_NAME = "texlive-plex-doc-2023.209.svn64496-53.1.noarch.rpm"
RPM_HASH = "4fc16f24d60686bd98be714a868c63d961d335e0a9df86986682237060dbb03a8c6fc9ada3a3d2f758b69c8817d5f61b12c6ebbe95613a6ef36574e833f602f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plex-doc"

RDEPENDS:${PN} += ""

inherit rpm
