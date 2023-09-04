SUMMARY = "Documentation for texlive-hexboard"
DESCRIPTION = "This package includes the documentation for texlive-hexboard"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn62102"

RPM_NAME = "texlive-hexboard-doc-2023.209.1.0svn62102-54.2.noarch.rpm"
RPM_HASH = "a31ab3aa0c79f1bb1c01208c2f9bb28331a80bda9cf701cfe93787cb98d660c4aff680843938e04741c6132f7578ce634de397ec7e1338e25a48e8103eb5ae0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hexboard-doc"

RDEPENDS:${PN} += ""

inherit rpm
