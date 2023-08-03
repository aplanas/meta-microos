SUMMARY = "Documentation for texlive-context-construction-plan"
DESCRIPTION = "This package includes the documentation for texlive-context-construction-plan"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-construction-plan-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "83524d86e6f471a29ba1847ecb887ab033f381f5ac669578a479352e216423869ebab2d1871adf4539a52f162ea616bc330d217e1dcd9d232489353d6c56d0c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-construction-plan-doc"

RDEPENDS:${PN} += ""

inherit rpm
