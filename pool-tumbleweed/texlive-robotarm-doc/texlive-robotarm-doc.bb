SUMMARY = "Documentation for texlive-robotarm"
DESCRIPTION = "This package includes the documentation for texlive-robotarm"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn63116"

RPM_NAME = "texlive-robotarm-doc-2023.209.0.0.1svn63116-54.2.noarch.rpm"
RPM_HASH = "425e7ae75ca745ceb199f7659992d4292c50fae8200a38b6798d8d4d077fef57800d727694105ac082ba3ad8c15b4af192bce2a01c302c639902e5c6a95f00c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-robotarm-doc"

RDEPENDS:${PN} += ""

inherit rpm
