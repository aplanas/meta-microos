SUMMARY = "Documentation for texlive-babel-lithuanian"
DESCRIPTION = "This package includes the documentation for texlive-babel-lithuanian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn66513"

RPM_NAME = "texlive-babel-lithuanian-doc-2023.201.1.0svn66513-53.1.noarch.rpm"
RPM_HASH = "aca80c761a1443e2700996ac5a6b101bf7aebfbce3b85c0a9995bd9b3d98977c4792f30263b2fa4ef14de815a3d3715d96529701aa0e0fc070fa2881ba4b11d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-lithuanian-doc"
RDEPENDS:${PN} += ""

inherit rpm
