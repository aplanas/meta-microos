SUMMARY = "Documentation for texlive-feynmp-auto"
DESCRIPTION = "This package includes the documentation for texlive-feynmp-auto"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn30223"

RPM_NAME = "texlive-feynmp-auto-doc-2023.201.1.1svn30223-52.1.noarch.rpm"
RPM_HASH = "d199a8b5bd3d920e5644980dd815aee9db723bc321d01e7354ad398728116219e39f74f817da563fa02c435f145e83547a4d7b660d6dbc8f50d607aa13c9cc9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-feynmp-auto-doc"
RDEPENDS:${PN} += ""

inherit rpm
