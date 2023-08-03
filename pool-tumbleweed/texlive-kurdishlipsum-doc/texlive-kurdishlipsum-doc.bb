SUMMARY = "Documentation for texlive-kurdishlipsum"
DESCRIPTION = "This package includes the documentation for texlive-kurdishlipsum"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47518"

RPM_NAME = "texlive-kurdishlipsum-doc-2023.209.1.1svn47518-56.1.noarch.rpm"
RPM_HASH = "3a5c093349bef64f38475037f17f02120bbe03e61e8ec47c4c7608750da1efc6417d3cedf1d9b68cf76a640dfff8ca7ae9bf45b6f250199e0126c4801fd44590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kurdishlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
