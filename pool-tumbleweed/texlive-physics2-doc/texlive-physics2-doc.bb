SUMMARY = "Documentation for texlive-physics2"
DESCRIPTION = "This package includes the documentation for texlive-physics2"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn66115"

RPM_NAME = "texlive-physics2-doc-2023.209.0.0.1.1svn66115-52.1.noarch.rpm"
RPM_HASH = "bd593a0c1178a7a74ef1bad9c14f08ab9f19dae231cbdaf2af60a8a779bca7b2d939df1dfe118a76d4c1cc6da291bf558f7895d14d622b7eac4affee46c5c1f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physics2-doc"

RDEPENDS:${PN} += ""

inherit rpm
