SUMMARY = "Documentation for texlive-beamerthemeamurmaple"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemeamurmaple"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65698"

RPM_NAME = "texlive-beamerthemeamurmaple-doc-2023.201.1.2svn65698-53.1.noarch.rpm"
RPM_HASH = "aabed475e8dcf1b04b6911de9496942c961707919e77be27aa633b56416146bf942aed03ef9725e9a80c532f6768689dcb60b7add4be897dcf75b65b02242589"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemeamurmaple-doc"

RDEPENDS:${PN} += ""

inherit rpm
