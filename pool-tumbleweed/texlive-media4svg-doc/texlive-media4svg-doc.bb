SUMMARY = "Documentation for texlive-media4svg"
DESCRIPTION = "This package includes the documentation for texlive-media4svg"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn64686"

RPM_NAME = "texlive-media4svg-doc-2023.201.0.0.13svn64686-52.1.noarch.rpm"
RPM_HASH = "95e92e1ff4f477660dc52771dbdcbee3c1f6b311c7bfc166fcd2abaf2cd514436f3ddc4af37cf3741138e801fcb668346cb5c6af9ff74e245ec5ad241578ac03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-media4svg-doc"

RDEPENDS:${PN} += ""

inherit rpm
