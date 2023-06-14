SUMMARY = "Documentation for texlive-sduthesis"
DESCRIPTION = "This package includes the documentation for texlive-sduthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.1svn41401"

RPM_NAME = "texlive-sduthesis-doc-2023.201.1.2.1svn41401-53.1.noarch.rpm"
RPM_HASH = "32fae6e20cd3b3136fdda7571f3023630e6b8c0c78269e75f22ecabb0c68e037f5cf797e2424a97564a5dd4014f0a9a8e4cf6bfd8e48606a20d0fafaba0ea0fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-sduthesis-doc-zh \
texlive-sduthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
