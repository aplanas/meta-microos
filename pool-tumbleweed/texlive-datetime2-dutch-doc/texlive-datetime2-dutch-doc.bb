SUMMARY = "Documentation for texlive-datetime2-dutch"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-dutch"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47355"

RPM_NAME = "texlive-datetime2-dutch-doc-2023.209.1.1svn47355-53.1.noarch.rpm"
RPM_HASH = "e1318683bb7573b960ae3bb030420430f7a7662bd71de2ea4a6c622c807ec3451ba420b6ca67cde368f9d10bfd060f7c81fa2dad6810c0d2baa3dcfbbd3afc82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-dutch-doc"

RDEPENDS:${PN} += ""

inherit rpm
