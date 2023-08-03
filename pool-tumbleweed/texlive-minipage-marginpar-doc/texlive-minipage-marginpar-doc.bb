SUMMARY = "Documentation for texlive-minipage-marginpar"
DESCRIPTION = "This package includes the documentation for texlive-minipage-marginpar"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-minipage-marginpar-doc-2023.209.0.0.2svn15878-55.1.noarch.rpm"
RPM_HASH = "7cc2d4d78fc9bd5df32993ccdd2ea9370be9d0514401dde6cddfb940df8f78450b4652d4b8baa78c9c795d120485b84f0f2c8ef74d26bd93478cdada141b0917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-minipage-marginpar-doc-de \
texlive-minipage-marginpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
