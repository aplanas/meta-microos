SUMMARY = "Documentation for texlive-beamer-fuberlin"
DESCRIPTION = "This package includes the documentation for texlive-beamer-fuberlin"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02bsvn63161"

RPM_NAME = "texlive-beamer-fuberlin-doc-2023.209.0.0.02bsvn63161-54.1.noarch.rpm"
RPM_HASH = "5a5606fae98fee06a9c08ba35e8d92e2d2e73d3e379ecfb4dec308b26836a870c2b6a991e977ec253fd68e3108e11ba018e384ec80cff152c687ad3edbc43910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-fuberlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
