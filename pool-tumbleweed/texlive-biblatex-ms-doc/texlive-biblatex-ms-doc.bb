SUMMARY = "Documentation for texlive-biblatex-ms"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ms"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0_1svn66480"

RPM_NAME = "texlive-biblatex-ms-doc-2023.209.4.0_1svn66480-54.1.noarch.rpm"
RPM_HASH = "83ad81a5b24ed5bf5d1fef51f60ab6d649ef906d7d3095062fb0890e635fd7f44bd1562328a9907421929baf7aed21066b3fd8bd2ec8f29aa3094efb7aade91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-ms-doc-en \
texlive-biblatex-ms-doc"

RDEPENDS:${PN} += ""

inherit rpm
