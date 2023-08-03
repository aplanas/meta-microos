SUMMARY = "Documentation for texlive-euclideangeometry"
DESCRIPTION = "This package includes the documentation for texlive-euclideangeometry"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.1svn60697"

RPM_NAME = "texlive-euclideangeometry-doc-2023.209.0.0.2.1svn60697-53.1.noarch.rpm"
RPM_HASH = "bc9d485c12f924c361c81e6c5343fc9547447f0bf4eacab954d624eff57ea9b661c215ff3352170e5086f13090998b6bf12e55bbed3b842489338712544b4fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euclideangeometry-doc"

RDEPENDS:${PN} += ""

inherit rpm
