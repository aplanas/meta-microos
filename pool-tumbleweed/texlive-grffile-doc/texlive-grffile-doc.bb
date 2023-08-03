SUMMARY = "Documentation for texlive-grffile"
DESCRIPTION = "This package includes the documentation for texlive-grffile"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn52756"

RPM_NAME = "texlive-grffile-doc-2023.209.2.1svn52756-54.1.noarch.rpm"
RPM_HASH = "ea78a1a03309a60360fafde93e96e044869894fa7a1364d780bcbcff7583b572140824e87da6689b5950e4c89f64c78798d18efc04f5eb082b58a67e216b52c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grffile-doc"

RDEPENDS:${PN} += ""

inherit rpm
