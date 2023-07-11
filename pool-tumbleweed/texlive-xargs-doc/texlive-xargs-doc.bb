SUMMARY = "Documentation for texlive-xargs"
DESCRIPTION = "This package includes the documentation for texlive-xargs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-xargs-doc-2023.201.1.1svn15878-52.2.noarch.rpm"
RPM_HASH = "4b4ae34e1b47888c4c4770bda6d72cb8bb63e0ac932f28ebfa3054e6efc0633863ec03968f29b5d4c15ed28d7599a79e3d1ff6254f9da0e3e349962b349d0f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xargs-doc-fr;en \
texlive-xargs-doc"

RDEPENDS:${PN} += ""

inherit rpm
