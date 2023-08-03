SUMMARY = "Documentation for texlive-tikz-mirror-lens"
DESCRIPTION = "This package includes the documentation for texlive-tikz-mirror-lens"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn65500"

RPM_NAME = "texlive-tikz-mirror-lens-doc-2023.209.1.0.2svn65500-53.1.noarch.rpm"
RPM_HASH = "9b123a04786fe30086559860ac9e4a1b64a4b710359a3817b7edbb49c247e456a1df6db1c57af604c819b559423aad295eca2ca2d7c9e4ac6b26b268443ef106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tikz-mirror-lens-doc-pt-BR \
texlive-tikz-mirror-lens-doc"

RDEPENDS:${PN} += ""

inherit rpm
