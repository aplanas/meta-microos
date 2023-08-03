SUMMARY = "Documentation for texlive-checkend"
DESCRIPTION = "This package includes the documentation for texlive-checkend"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51475"

RPM_NAME = "texlive-checkend-doc-2023.209.1.0svn51475-54.1.noarch.rpm"
RPM_HASH = "4689e46c60ecb04389f317faf0e8cad476c25c61a1f16fc9743f667c9e3b53e1d90d8518e7465f6dbe2f89f3d0a2b6c394b551fe3fa14bdd863e9861aed7c675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-checkend-doc"

RDEPENDS:${PN} += ""

inherit rpm
