SUMMARY = "Documentation for texlive-background"
DESCRIPTION = "This package includes the documentation for texlive-background"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn42428"

RPM_NAME = "texlive-background-doc-2023.201.2.1svn42428-53.1.noarch.rpm"
RPM_HASH = "daa232e1e834b8586920626ce0a5f44fa48c12ca6a198f2f67665f826e40a23bb37689da0acffb8e9b3cd8afc6993423a690831a79d59ed7d3a759d3f4df8da5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-background-doc"

RDEPENDS:${PN} += ""

inherit rpm
