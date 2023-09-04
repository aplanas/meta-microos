SUMMARY = "Documentation for texlive-heuristica"
DESCRIPTION = "This package includes the documentation for texlive-heuristica"
LICENSE = "OFL-1.1"

PV = "2023.209.1.092svn51362"

RPM_NAME = "texlive-heuristica-doc-2023.209.1.092svn51362-54.2.noarch.rpm"
RPM_HASH = "66ce4e16bb19e7e000dd8d2c3b40c9e6f43025c4c74179dc26831fb5a4bccd0fd6263bf78bbe3d1063f114a2a591bfea6317d738b305d34c04c3540c8387ebb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-heuristica-doc"

RDEPENDS:${PN} += ""

inherit rpm
