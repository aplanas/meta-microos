SUMMARY = "Documentation for texlive-bibtex8"
DESCRIPTION = "This package includes the documentation for texlive-bibtex8"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.72svn66186"

RPM_NAME = "texlive-bibtex8-doc-2023.209.3.72svn66186-54.1.noarch.rpm"
RPM_HASH = "d14a1add322c7fb826816f337e6c9e2cda54f0e7867b17cdc1ed4c16cc7fc66839f7a0e1ca00581f13314496de8a4a0079eb11306f5a68732c840b8be3241d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bibtex8.1 \
texlive-bibtex8-doc"

RDEPENDS:${PN} += ""

inherit rpm
