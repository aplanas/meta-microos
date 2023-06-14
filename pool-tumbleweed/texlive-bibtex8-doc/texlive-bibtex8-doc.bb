SUMMARY = "Documentation for texlive-bibtex8"
DESCRIPTION = "This package includes the documentation for texlive-bibtex8"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.72svn66186"

RPM_NAME = "texlive-bibtex8-doc-2023.201.3.72svn66186-53.1.noarch.rpm"
RPM_HASH = "724a4b25569a0c847b07fa1c652192c8d91fb8cd6fa230297d85a26cdf72a28845a7ebc4155b150d4bee21407135bc53445afcbb62b057fcde0cad4352e006f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bibtex8.1 \
texlive-bibtex8-doc"

RDEPENDS:${PN} += ""

inherit rpm
