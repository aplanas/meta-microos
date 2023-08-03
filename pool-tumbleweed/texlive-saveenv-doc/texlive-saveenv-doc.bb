SUMMARY = "Documentation for texlive-saveenv"
DESCRIPTION = "This package includes the documentation for texlive-saveenv"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.1svn65346"

RPM_NAME = "texlive-saveenv-doc-2023.209.0.0.0.1svn65346-54.1.noarch.rpm"
RPM_HASH = "a748d8ff62c672042c1040365e372a91c8959bf015b680c547bc915f9419a7b986431516b27c4fb924a251dcdf17accaef6cd028db12c0dcbc40f9b0ff9f1ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-saveenv-doc"

RDEPENDS:${PN} += ""

inherit rpm
