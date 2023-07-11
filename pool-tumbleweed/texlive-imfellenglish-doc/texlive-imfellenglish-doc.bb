SUMMARY = "Documentation for texlive-imfellenglish"
DESCRIPTION = "This package includes the documentation for texlive-imfellenglish"
LICENSE = "OFL-1.1"

PV = "2023.208.svn64568"

RPM_NAME = "texlive-imfellenglish-doc-2023.208.svn64568-53.1.noarch.rpm"
RPM_HASH = "d1d702b2fc858ae55ce4eb641e21243fb216294360e212b3633cf5d270d65200dc7b2a68c1df313baa8695a0e6d3b422138d1e27a28e3727a282add39554be15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imfellenglish-doc"

RDEPENDS:${PN} += ""

inherit rpm
