SUMMARY = "Documentation for texlive-easing"
DESCRIPTION = "This package includes the documentation for texlive-easing"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn59975"

RPM_NAME = "texlive-easing-doc-2023.201.0.0.1svn59975-53.1.noarch.rpm"
RPM_HASH = "e34751822492841247919833bbf742e74d36dcd2b34a61681a7137d90797460340639395fa3d55bc77d1a1419da95d109e9c95581726cba255d677811ee8c8e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easing-doc"

RDEPENDS:${PN} += ""

inherit rpm
