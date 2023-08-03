SUMMARY = "Documentation for texlive-tex-gyre-math"
DESCRIPTION = "This package includes the documentation for texlive-tex-gyre-math"
LICENSE = "LPPL-1.3c"

PV = "2023.209.svn41264"

RPM_NAME = "texlive-tex-gyre-math-doc-2023.209.svn41264-55.1.noarch.rpm"
RPM_HASH = "b9830036b90367a8b6f75170b1ff5c00916662424b16e7e43a8023d42ee42a56a474de0a3b890f67a5df1dccee1b4c4906b4a480a55e6c5837b1ac3138ecff53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-gyre-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
