SUMMARY = "Documentation for texlive-ledmac"
DESCRIPTION = "This package includes the documentation for texlive-ledmac"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.19.4svn41811"

RPM_NAME = "texlive-ledmac-doc-2023.209.0.0.19.4svn41811-55.1.noarch.rpm"
RPM_HASH = "4382c5883b7f57618afd2dd120ceaffee061aa53722e36a54d43b3d5bc4afcb6599f68b36bf3115a7deee8f954cc6ff352b350d3ae572ce664a704dc783a4d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
