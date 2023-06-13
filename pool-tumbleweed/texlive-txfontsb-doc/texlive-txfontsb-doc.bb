SUMMARY = "Documentation for texlive-txfontsb"
DESCRIPTION = "This package includes the documentation for texlive-txfontsb"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1.1svn54512"

RPM_NAME = "texlive-txfontsb-doc-2023.201.1.1.1svn54512-52.1.noarch.rpm"
RPM_HASH = "d4eaf8d690003eb4377c4db6bac2c248f5c1df7d13f83ad2c490c4c695be1ef7ca97e9a461a7e538e1a9ce72cfbffbd10f7d40508c98270b5fa7a0e33712cc1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-txfontsb-doc"

RDEPENDS:${PN} += ""

inherit rpm
