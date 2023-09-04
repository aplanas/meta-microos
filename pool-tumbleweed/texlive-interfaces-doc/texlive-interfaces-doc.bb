SUMMARY = "Documentation for texlive-interfaces"
DESCRIPTION = "This package includes the documentation for texlive-interfaces"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn21474"

RPM_NAME = "texlive-interfaces-doc-2023.209.3.1svn21474-54.1.noarch.rpm"
RPM_HASH = "33653f39377578d9ce2b2b9df1cd64510258fa0b57fb4537a48a9d7291b91b07edd13f5b0922838a5752fff043aa88197a82d8006d6385d669299be8d5ec1a1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interfaces-doc"

RDEPENDS:${PN} += ""

inherit rpm
