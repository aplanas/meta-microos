SUMMARY = "Documentation for texlive-elpres"
DESCRIPTION = "This package includes the documentation for texlive-elpres"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn60209"

RPM_NAME = "texlive-elpres-doc-2023.201.1.0.1svn60209-53.2.noarch.rpm"
RPM_HASH = "0f4f679917c578f2bc390642d3399fb2b167fdc309011703c94003f6329155aa95dfc5cab3d701c6a572c4c25b85632a76e1e6b4fa1415f03b0d8bf93ec135d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elpres-doc"

RDEPENDS:${PN} += ""

inherit rpm
