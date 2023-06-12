SUMMARY = "Documentation for texlive-bezierplot"
DESCRIPTION = "This package includes the documentation for texlive-bezierplot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn51398"

RPM_NAME = "texlive-bezierplot-doc-2023.201.1.4svn51398-53.1.noarch.rpm"
RPM_HASH = "f2308927eb54b6a4e18ccf27f606455b612a628e460197ee2728b5033eed769c015a36d2f5fde920fc67bb0f793237c9d0c647e1813f4025ac6bb44efa722834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bezierplot-doc"
RDEPENDS:${PN} += ""

inherit rpm
