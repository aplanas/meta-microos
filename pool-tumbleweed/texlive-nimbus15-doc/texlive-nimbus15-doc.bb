SUMMARY = "Documentation for texlive-nimbus15"
DESCRIPTION = "This package includes the documentation for texlive-nimbus15"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.014svn58839"

RPM_NAME = "texlive-nimbus15-doc-2023.209.1.014svn58839-55.1.noarch.rpm"
RPM_HASH = "1356de23fa75b967bb890dfdc745e943958fe22af24c2a02c51a203c98839f21a3d63658e650ed608dd989bc044c3135e10ee69e127699f58011de5d0d6e9d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nimbus15-doc"

RDEPENDS:${PN} += ""

inherit rpm
