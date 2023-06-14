SUMMARY = "Documentation for texlive-qtree"
DESCRIPTION = "This package includes the documentation for texlive-qtree"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1bsvn15878"

RPM_NAME = "texlive-qtree-doc-2023.201.3.1bsvn15878-53.1.noarch.rpm"
RPM_HASH = "8af355e03cee0ec423cbd6dfbf7aba4bf94f9d7adbffe1f9b5bbdd276c3d3f5e00a5262585c91b39387e8e1d47a4448d945f4766f81f295183b46fbe89dcc9f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-qtree-doc-en \
texlive-qtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
