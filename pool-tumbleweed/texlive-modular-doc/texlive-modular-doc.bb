SUMMARY = "Documentation for texlive-modular"
DESCRIPTION = "This package includes the documentation for texlive-modular"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44142"

RPM_NAME = "texlive-modular-doc-2023.209.svn44142-55.1.noarch.rpm"
RPM_HASH = "f3e0b17e22cdc8838c6328c7c1388821b3d2d0a5247c4a3b515851fc6bf330e627e27b46d8c28251358db46cf458c89b53e0694a7cf38a79097c13bc27e85b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modular-doc"

RDEPENDS:${PN} += ""

inherit rpm
