SUMMARY = "Documentation for texlive-lexref"
DESCRIPTION = "This package includes the documentation for texlive-lexref"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn36026"

RPM_NAME = "texlive-lexref-doc-2023.209.1.1asvn36026-55.1.noarch.rpm"
RPM_HASH = "31ae1aa5119a99cd69c84833ec4375c041929806ca7b2275d84c85a65cf8ed9e4ad6faa2dee2af92b636e38585f8cc154e3f3d414ceacdd70ae9bffdeb71274a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lexref-doc"

RDEPENDS:${PN} += ""

inherit rpm
