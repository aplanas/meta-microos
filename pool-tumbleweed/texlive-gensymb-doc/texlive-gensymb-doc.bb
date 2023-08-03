SUMMARY = "Documentation for texlive-gensymb"
DESCRIPTION = "This package includes the documentation for texlive-gensymb"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn64740"

RPM_NAME = "texlive-gensymb-doc-2023.209.1.0.2svn64740-53.1.noarch.rpm"
RPM_HASH = "833f48a978f4fef6eb436d0520ec13985cdd3f467ddce2d782a9975e30be1e0850188a131ecc5b2d13fc106a655fec2616a1f01722561bba9222c3fae41c1aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gensymb-doc"

RDEPENDS:${PN} += ""

inherit rpm
