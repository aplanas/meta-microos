SUMMARY = "Documentation for texlive-xdvi"
DESCRIPTION = "This package includes the documentation for texlive-xdvi"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62387"

RPM_NAME = "texlive-xdvi-doc-2023.209.svn62387-53.2.noarch.rpm"
RPM_HASH = "1fb55ba218256747df74f7de884888d15ab8e256a3ae6d675c909b6f8bcf7ad934d068bed57abfc5a39d36fe850e3c1ef6901d71887df81aa92d207deb74e11c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-xdvi.1 \
texlive-xdvi-doc"

RDEPENDS:${PN} += ""

inherit rpm
