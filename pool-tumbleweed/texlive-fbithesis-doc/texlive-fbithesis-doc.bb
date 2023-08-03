SUMMARY = "Documentation for texlive-fbithesis"
DESCRIPTION = "This package includes the documentation for texlive-fbithesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2msvn21340"

RPM_NAME = "texlive-fbithesis-doc-2023.209.1.2msvn21340-53.1.noarch.rpm"
RPM_HASH = "d237e0416aa539da5ec516c05a9ec81b4a3d07ab9a15dedda8581f070d40fa3480244b15c6604750e02db57b4f7d70bdda44ea76617a4cfa15f7112801bc4bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fbithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
