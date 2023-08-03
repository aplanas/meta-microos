SUMMARY = "Documentation for texlive-lambdax"
DESCRIPTION = "This package includes the documentation for texlive-lambdax"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn60278"

RPM_NAME = "texlive-lambdax-doc-2023.209.1.1svn60278-56.1.noarch.rpm"
RPM_HASH = "6101e10c297d61d2da533e6e50674aeba03c4a9740b6406282a244b2cfba49d08ac1c8fbbe4c175c9143391534908e0a9216f14c2cc95ba7b43a419dbe6b5f4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lambdax-doc"

RDEPENDS:${PN} += ""

inherit rpm
