SUMMARY = "Documentation for texlive-stealcaps"
DESCRIPTION = "This package includes the documentation for texlive-stealcaps"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64967"

RPM_NAME = "texlive-stealcaps-doc-2023.209.1.1svn64967-58.1.noarch.rpm"
RPM_HASH = "0a3d33dc991274d8e4834673be56c5bd62aba64d3cb014912af8d3484b896dc4b402b61537d598d9e6b08d44f1805e2da28461e3500e2676f42cf2b3b83db184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stealcaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
