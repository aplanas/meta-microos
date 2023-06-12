SUMMARY = "Documentation for texlive-circ"
DESCRIPTION = "This package includes the documentation for texlive-circ"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn62977"

RPM_NAME = "texlive-circ-doc-2023.201.1.1svn62977-53.1.noarch.rpm"
RPM_HASH = "c3d151d766622075cf9446a5f6cfe1431d142cc4047dfc7b6f8e327d862342c8f1cf8c7815f23ef5e774a1db93fe2fb25ad89de5747880cd82661c460aba9a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-circ-doc"
RDEPENDS:${PN} += ""

inherit rpm
