SUMMARY = "Documentation for texlive-xellipsis"
DESCRIPTION = "This package includes the documentation for texlive-xellipsis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn47546"

RPM_NAME = "texlive-xellipsis-doc-2023.201.2.0svn47546-52.1.noarch.rpm"
RPM_HASH = "d0cd8e120c072920b376fa25eee8c6ebb3695c9bd8a330f9bb90843421407edb730abf5844a43e0f7427e4c3e54fad08e60e4660da57d4479af2ce2c818eca0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xellipsis-doc"
RDEPENDS:${PN} += ""

inherit rpm
