SUMMARY = "Documentation for texlive-koma-moderncvclassic"
DESCRIPTION = "This package includes the documentation for texlive-koma-moderncvclassic"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn25025"

RPM_NAME = "texlive-koma-moderncvclassic-doc-2023.209.0.0.5svn25025-56.1.noarch.rpm"
RPM_HASH = "323435fd6c2136edc0fdfb8e494ffc6bfdc6cce88c119695f7addb45755c9ed32ed9c16fe8be9778cf3394a37a653fcfbc3d3b2c3f8e1054e5392c11a1f6bc8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-koma-moderncvclassic-doc"

RDEPENDS:${PN} += ""

inherit rpm
