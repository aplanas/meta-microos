SUMMARY = "Documentation for texlive-blochsphere"
DESCRIPTION = "This package includes the documentation for texlive-blochsphere"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn38388"

RPM_NAME = "texlive-blochsphere-doc-2023.209.1.1svn38388-53.1.noarch.rpm"
RPM_HASH = "bb5ed9885612db1a8a670d3a4294eeaa64eb1268d08aaf61cab899d49a6a554de78459e3986909170022e5d4bab0d491b6a1cbac146d83b22caf976cdaaf0f15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blochsphere-doc"

RDEPENDS:${PN} += ""

inherit rpm
