SUMMARY = "Documentation for texlive-newcastle-bst"
DESCRIPTION = "This package includes the documentation for texlive-newcastle-bst"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn62856"

RPM_NAME = "texlive-newcastle-bst-doc-2023.209.1.1svn62856-55.1.noarch.rpm"
RPM_HASH = "ace34a8fe40851c46bf1805869189d162b5d38b6df210b2d901c727a4905e11e1d002301463462ad7b69e568cb5f60a14f39fafa0aed6c50bf34dac775677a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newcastle-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
