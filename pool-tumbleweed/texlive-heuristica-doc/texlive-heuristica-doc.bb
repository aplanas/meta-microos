SUMMARY = "Documentation for texlive-heuristica"
DESCRIPTION = "This package includes the documentation for texlive-heuristica"
LICENSE = "OFL-1.1"

PV = "2023.201.1.092svn51362"

RPM_NAME = "texlive-heuristica-doc-2023.201.1.092svn51362-53.2.noarch.rpm"
RPM_HASH = "b8910aff0c2c5520f26e170ee15cbd2f0905a7921f4e05e7e00ae29a9e6d8db7ab76bf8c44f7d86c758074608b03dd29b1b46ac669cd87abedb0826f8fdb73e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-heuristica-doc"

RDEPENDS:${PN} += ""

inherit rpm
