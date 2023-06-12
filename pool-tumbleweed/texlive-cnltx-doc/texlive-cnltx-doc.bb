SUMMARY = "Documentation for texlive-cnltx"
DESCRIPTION = "This package includes the documentation for texlive-cnltx"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.15svn55265"

RPM_NAME = "texlive-cnltx-doc-2023.201.0.0.15svn55265-53.1.noarch.rpm"
RPM_HASH = "8bd885b5094a1d62f3598e87a49aa52e0673f8c0f186d3a55f44ee5068446754e1c5195ff3a5a4edb7870114f6e6a7dd5131e92eeaf51f5b8e84d03f645e1fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cnltx-doc"
RDEPENDS:${PN} += ""

inherit rpm
