SUMMARY = "Documentation for texlive-reflectgraphics"
DESCRIPTION = "This package includes the documentation for texlive-reflectgraphics"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2csvn40612"

RPM_NAME = "texlive-reflectgraphics-doc-2023.201.0.0.2csvn40612-53.2.noarch.rpm"
RPM_HASH = "62fc94543451979cbbb63e402fc94688b7b585ae868d7c2809e15a10ec4a3889853b3e52561a01ecd2af30ca90f2090ce8b2f943c80313cb86d2916d59fa60b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reflectgraphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
