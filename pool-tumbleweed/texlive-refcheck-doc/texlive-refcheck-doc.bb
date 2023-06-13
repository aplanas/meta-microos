SUMMARY = "Documentation for texlive-refcheck"
DESCRIPTION = "This package includes the documentation for texlive-refcheck"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.9.1svn29128"

RPM_NAME = "texlive-refcheck-doc-2023.201.1.9.1svn29128-53.1.noarch.rpm"
RPM_HASH = "920ba16481b159889e7b909973033251fbd49818e464be614b45ccfa16f3b3682cf9bbc9bdaf5370b1e8f18d3c9e9d41fe5403065f080a33ff1afa8f903ddfc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refcheck-doc"

RDEPENDS:${PN} += ""

inherit rpm
