SUMMARY = "Documentation for texlive-pxufont"
DESCRIPTION = "This package includes the documentation for texlive-pxufont"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn64072"

RPM_NAME = "texlive-pxufont-doc-2023.209.0.0.6svn64072-54.2.noarch.rpm"
RPM_HASH = "97a1306e5750c76f2fd3708a90fcab1c22a3906369d63dbcb021e4c41c72b081c6aec5878a6fc9997fbe039570745ca45b3cfa6af1d516764e6c221606f8b62b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxufont-doc"

RDEPENDS:${PN} += ""

inherit rpm
