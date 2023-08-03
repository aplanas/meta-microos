SUMMARY = "Documentation for texlive-ghab"
DESCRIPTION = "This package includes the documentation for texlive-ghab"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn29803"

RPM_NAME = "texlive-ghab-doc-2023.209.0.0.5svn29803-53.1.noarch.rpm"
RPM_HASH = "b658a033cedfb55c5d54d7216a1360d62fcbec148c4504d88c4c88bc7c55be62d90dbb0743bc6e11206b8b594d409281d81755544479c09cb8c941ee63bee999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ghab-doc"

RDEPENDS:${PN} += ""

inherit rpm
