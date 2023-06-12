SUMMARY = "Documentation for texlive-derivative"
DESCRIPTION = "This package includes the documentation for texlive-derivative"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn63850"

RPM_NAME = "texlive-derivative-doc-2023.201.1.2svn63850-52.1.noarch.rpm"
RPM_HASH = "7f224012862b9c03b8ed5883604a5d6213bff2d57d3ee4f32b5891326160994de7d7d9e59dd49f2f01459e32a94ad42b9aa36fd361653ee8d14ebd558b104051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-derivative-doc"
RDEPENDS:${PN} += ""

inherit rpm
