SUMMARY = "Documentation for texlive-uplatex"
DESCRIPTION = "This package includes the documentation for texlive-uplatex"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-uplatex-doc-2023.209.svn66186-54.1.noarch.rpm"
RPM_HASH = "fdaadc98c05b5e2dfff5fb4b7a2fc8325e174be9139349a606c752dedce42d72075fdf249a9e5c2a4dc7286254671f03fcefaa6afa681a4ef789e7b8cda31f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-uplatex-doc-ja \
man-uplatex.1 \
texlive-uplatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
