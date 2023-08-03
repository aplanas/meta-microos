SUMMARY = "Documentation for texlive-pdfmanagement-testphase"
DESCRIPTION = "This package includes the documentation for texlive-pdfmanagement-testphase"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.95xsvn66532"

RPM_NAME = "texlive-pdfmanagement-testphase-doc-2023.209.0.0.95xsvn66532-52.1.noarch.rpm"
RPM_HASH = "06bd7a1e2bca8b363b40905c0afa473e0677536a0aa3583f32ff1f58aa3d43daaf8dc440b64a352772f267ff2d0e5f0ac55e82cb1fcb6903c82f292472b362a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfmanagement-testphase-doc"

RDEPENDS:${PN} += ""

inherit rpm
