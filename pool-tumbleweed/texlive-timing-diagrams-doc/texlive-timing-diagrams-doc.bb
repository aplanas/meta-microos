SUMMARY = "Documentation for texlive-timing-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-timing-diagrams"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn31491"

RPM_NAME = "texlive-timing-diagrams-doc-2023.201.svn31491-52.1.noarch.rpm"
RPM_HASH = "de85973f95d7522c772a8c87ac72f69eb5f693d327aa03261f0051030321708bba5bfb5526f795dc141f648cd29300f1cbd8f80a8ae3b95c382c66bb967d88c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-timing-diagrams-doc"
RDEPENDS:${PN} += ""

inherit rpm
