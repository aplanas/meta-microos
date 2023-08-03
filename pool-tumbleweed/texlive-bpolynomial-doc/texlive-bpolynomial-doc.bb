SUMMARY = "Documentation for texlive-bpolynomial"
DESCRIPTION = "This package includes the documentation for texlive-bpolynomial"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn15878"

RPM_NAME = "texlive-bpolynomial-doc-2023.209.0.0.5svn15878-53.1.noarch.rpm"
RPM_HASH = "23a55e6de0f2ec3c3f5da2e231c42b44431a86bf711ba106d3f4d48ab82c14fe9a343d88030a5d9ddbee651aa44390b0d1a7dd6a997f32784804d4674a6bce0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bpolynomial-doc"

RDEPENDS:${PN} += ""

inherit rpm
