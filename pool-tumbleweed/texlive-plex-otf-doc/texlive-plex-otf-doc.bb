SUMMARY = "Documentation for texlive-plex-otf"
DESCRIPTION = "This package includes the documentation for texlive-plex-otf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.07asvn47562"

RPM_NAME = "texlive-plex-otf-doc-2023.201.0.0.07asvn47562-52.1.noarch.rpm"
RPM_HASH = "acb2e93aa3d2298f56d5a831417ee6af1781c986be222e0448d0bd0b4751580390227bc44a0a9565ef6ba88b141434aef0d2a934c2d6d2fc9f85a3cadceda44a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plex-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
