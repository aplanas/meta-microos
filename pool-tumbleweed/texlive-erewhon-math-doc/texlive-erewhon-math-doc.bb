SUMMARY = "Documentation for texlive-erewhon-math"
DESCRIPTION = "This package includes the documentation for texlive-erewhon-math"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.56svn65684"

RPM_NAME = "texlive-erewhon-math-doc-2023.201.0.0.56svn65684-53.2.noarch.rpm"
RPM_HASH = "0c3a1495889f2e0d3c3fd33f089592b99200fef4bcc2fc93bd784e44ce7fb7a182aae70092298cbba535b8caceb2289e7300a952e65c9280b73cc82f6fe5039d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erewhon-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
