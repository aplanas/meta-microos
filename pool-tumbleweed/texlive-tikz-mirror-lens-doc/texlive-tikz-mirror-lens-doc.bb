SUMMARY = "Documentation for texlive-tikz-mirror-lens"
DESCRIPTION = "This package includes the documentation for texlive-tikz-mirror-lens"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn65500"

RPM_NAME = "texlive-tikz-mirror-lens-doc-2023.201.1.0.2svn65500-52.1.noarch.rpm"
RPM_HASH = "764c12337c1979b68c9b0414bd91f241cb797d5ba78af01d405ada21fbc56aadae1619b1e32ced3555cc2fcb5ccf2991b418b493da90da45183efca084ae1e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tikz-mirror-lens-doc:pt_BR) \
texlive-tikz-mirror-lens-doc"

RDEPENDS:${PN} += ""

inherit rpm
