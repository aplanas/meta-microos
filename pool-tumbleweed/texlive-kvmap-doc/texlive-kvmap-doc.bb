SUMMARY = "Documentation for texlive-kvmap"
DESCRIPTION = "This package includes the documentation for texlive-kvmap"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.5svn56361"

RPM_NAME = "texlive-kvmap-doc-2023.209.0.0.3.5svn56361-56.1.noarch.rpm"
RPM_HASH = "bb9b3c5407ae05379571fbf2a3f3707cfd99eb2340c5d3d402e965ff3492170cf6af47e0e04d6e86951e9ad757c4ced8c11188025271683996b35549fdf54f39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kvmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
