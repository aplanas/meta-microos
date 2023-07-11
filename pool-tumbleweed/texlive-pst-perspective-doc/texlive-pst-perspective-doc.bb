SUMMARY = "Documentation for texlive-pst-perspective"
DESCRIPTION = "This package includes the documentation for texlive-pst-perspective"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn39585"

RPM_NAME = "texlive-pst-perspective-doc-2023.201.1.05svn39585-53.2.noarch.rpm"
RPM_HASH = "cc13149b2932dbd1008ea8297f2af572fb3fa62a837c84bbfd4de31bf72feef7539279aaa3e7bcfce0e23994177254a228f7d0eed31ced0fec4787f1999e9fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-perspective-doc-de;en \
texlive-pst-perspective-doc"

RDEPENDS:${PN} += ""

inherit rpm
