SUMMARY = "Documentation for texlive-pst-lens"
DESCRIPTION = "This package includes the documentation for texlive-pst-lens"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn15878"

RPM_NAME = "texlive-pst-lens-doc-2023.209.1.02svn15878-53.1.noarch.rpm"
RPM_HASH = "f33ebcc5cdd0208722a25c32e2d6bd5f69929dc917d6f12eb7d1daccf9054a2911e798d828e0d6c55555be9111b7cf6bac90859ce603091dd9657bfd91a052c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-lens-doc"

RDEPENDS:${PN} += ""

inherit rpm
