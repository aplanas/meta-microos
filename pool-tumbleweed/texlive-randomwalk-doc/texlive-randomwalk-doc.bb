SUMMARY = "Documentation for texlive-randomwalk"
DESCRIPTION = "This package includes the documentation for texlive-randomwalk"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn49513"

RPM_NAME = "texlive-randomwalk-doc-2023.209.0.0.6svn49513-54.1.noarch.rpm"
RPM_HASH = "293fb9b21d8574448441bc8c8bfc895f4909786398021e37bcb461b92ba334261275b0a697bf36d17ad19c84544dd13a89ab455ef9b57f0d56d144f0a9601178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randomwalk-doc"

RDEPENDS:${PN} += ""

inherit rpm
