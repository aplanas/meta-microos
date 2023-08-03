SUMMARY = "Documentation for texlive-ninecolors"
DESCRIPTION = "This package includes the documentation for texlive-ninecolors"
LICENSE = "LPPL-1.0"

PV = "2023.209.2022dsvn62006"

RPM_NAME = "texlive-ninecolors-doc-2023.209.2022dsvn62006-55.1.noarch.rpm"
RPM_HASH = "d8edccb1f754892c66b5cdf496cd65956b911cd2778ef41216700e519fec2509593fcaf5bd3165038f10bc0d8df98ec3820ebbcf0955b069db6dc1b2b891532b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ninecolors-doc"

RDEPENDS:${PN} += ""

inherit rpm
