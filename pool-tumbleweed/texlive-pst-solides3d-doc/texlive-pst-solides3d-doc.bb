SUMMARY = "Documentation for texlive-pst-solides3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-solides3d"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.34asvn61719"

RPM_NAME = "texlive-pst-solides3d-doc-2023.209.4.34asvn61719-54.2.noarch.rpm"
RPM_HASH = "a13e0e58c40000fb5476419ea162e29ec12f091e49728901b8c4133ebde758ac25c37db7fee06f3ccb876439affedd473ac826da85a9cd4d0116e103f803c417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-solides3d-doc-en \
texlive-pst-solides3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
