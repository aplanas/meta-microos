SUMMARY = "Documentation for texlive-zref-vario"
DESCRIPTION = "This package includes the documentation for texlive-zref-vario"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.7svn65453"

RPM_NAME = "texlive-zref-vario-doc-2023.201.0.0.1.7svn65453-52.1.noarch.rpm"
RPM_HASH = "8d1c23e5f8f6ca12bb11ca4bdc20ea0a7cf385946d485b12e80f84612f59f4fbef1dd0883dbcbbd128d83bb190803eda3f90a528b75c477394d745731ab9bc4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-vario-doc"
RDEPENDS:${PN} += ""

inherit rpm
