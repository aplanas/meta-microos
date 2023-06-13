SUMMARY = "Documentation for texlive-soul"
DESCRIPTION = "This package includes the documentation for texlive-soul"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn65908"

RPM_NAME = "texlive-soul-doc-2023.201.3.0svn65908-57.1.noarch.rpm"
RPM_HASH = "c530d717e4b441c29ba77e976dd54d7836ff47d58900b07226d8d49d97aef9976a07746fba2dc33678dc1c8ff72f4621b53986023e420df3bb3c7485e2d160a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-soul-doc"

RDEPENDS:${PN} += ""

inherit rpm
