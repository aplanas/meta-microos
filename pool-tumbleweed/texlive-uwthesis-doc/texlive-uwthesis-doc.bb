SUMMARY = "Documentation for texlive-uwthesis"
DESCRIPTION = "This package includes the documentation for texlive-uwthesis"
LICENSE = "Apache-1.0"

PV = "2023.201.6.13svn15878"

RPM_NAME = "texlive-uwthesis-doc-2023.201.6.13svn15878-53.1.noarch.rpm"
RPM_HASH = "09d0aac27a0c2fe95a847328c321e919aa6004d4f672135f0495f87ef9c66b689e7dd0907ff2037fae0cef6383bc316754862c6738acc1ef0347771244f8bec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
