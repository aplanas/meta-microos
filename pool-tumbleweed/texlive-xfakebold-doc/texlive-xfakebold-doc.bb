SUMMARY = "Documentation for texlive-xfakebold"
DESCRIPTION = "This package includes the documentation for texlive-xfakebold"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.08svn55654"

RPM_NAME = "texlive-xfakebold-doc-2023.209.0.0.08svn55654-53.1.noarch.rpm"
RPM_HASH = "bf6a0079107f9393d5c5cac7310503e4dd5266fc7bafb234ae5ad67f739525829bd55bf4f741203af3110c25058bbfb841faae40e2b4134027b6630831f60dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xfakebold-doc"

RDEPENDS:${PN} += ""

inherit rpm
