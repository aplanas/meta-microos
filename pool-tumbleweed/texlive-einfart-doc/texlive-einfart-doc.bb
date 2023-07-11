SUMMARY = "Documentation for texlive-einfart"
DESCRIPTION = "This package includes the documentation for texlive-einfart"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65475"

RPM_NAME = "texlive-einfart-doc-2023.201.svn65475-53.2.noarch.rpm"
RPM_HASH = "c039539dc6744087a07a22d07d1391810ecd027c43cb8e8aaf1a6bac30c4a0f5bcd5f63610feba5e653865581f55cdcd3a8551a6af3f8f363bc32561504d1f2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-einfart-doc"

RDEPENDS:${PN} += ""

inherit rpm
