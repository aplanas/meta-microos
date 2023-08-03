SUMMARY = "Documentation for texlive-cinzel"
DESCRIPTION = "This package includes the documentation for texlive-cinzel"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64550"

RPM_NAME = "texlive-cinzel-doc-2023.209.svn64550-54.1.noarch.rpm"
RPM_HASH = "35c565ac63ddc3d8f4cae9cdb19f1626e4f836d192dfa953786d5dbafd99851c045fa67c042cc2af093fecf898e2548b467e5315b981b6502468b171ed2e4bc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cinzel-doc"

RDEPENDS:${PN} += ""

inherit rpm
