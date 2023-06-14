SUMMARY = "Documentation for texlive-seuthesis"
DESCRIPTION = "This package includes the documentation for texlive-seuthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1.2svn33042"

RPM_NAME = "texlive-seuthesis-doc-2023.201.2.1.2svn33042-53.1.noarch.rpm"
RPM_HASH = "eba23242c87b590996f9e37cebfcee16cc48a066041ff2d62c399781882dd8e323b369d3ca21c80bd1222e7b9dd22f9bf19c43407ed326f70f439b2b2a51003a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-seuthesis-doc-zh \
texlive-seuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
