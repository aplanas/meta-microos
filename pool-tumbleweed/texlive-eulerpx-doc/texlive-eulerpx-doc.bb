SUMMARY = "Documentation for texlive-eulerpx"
DESCRIPTION = "This package includes the documentation for texlive-eulerpx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn63967"

RPM_NAME = "texlive-eulerpx-doc-2023.209.1.0svn63967-53.1.noarch.rpm"
RPM_HASH = "68e5f925524087cf5d2f8c59b138581eb8bf136f0a0e80ce50795ea1414694aafced53c92c6d3b9adf9e69c5b4c4d02864092323fcfb1a294b147c5acff1993d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eulerpx-doc"

RDEPENDS:${PN} += ""

inherit rpm
