SUMMARY = "Documentation for texlive-heuristica"
DESCRIPTION = "This package includes the documentation for texlive-heuristica"
LICENSE = "OFL-1.1"

PV = "2023.209.1.092svn51362"

RPM_NAME = "texlive-heuristica-doc-2023.209.1.092svn51362-54.1.noarch.rpm"
RPM_HASH = "83a115abc44a3d30b619e27537084dda20d49eaf38e74c58eb04f69f8c3b9f2b66bc017594943f025e20f401ba8ebd92f691f06231e6d1470327d1388d7dbcae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-heuristica-doc"

RDEPENDS:${PN} += ""

inherit rpm
