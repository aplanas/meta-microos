SUMMARY = "Documentation for texlive-framed"
DESCRIPTION = "This package includes the documentation for texlive-framed"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.96svn26789"

RPM_NAME = "texlive-framed-doc-2023.209.0.0.96svn26789-53.1.noarch.rpm"
RPM_HASH = "03f1b6bdb6d2cea038430f023477c61983cb0d3f85df10d9952050cdfacca93d010e8c71d58259f733edfc99ed01a338831f82bc55c45f0b1120d662220522e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-framed-doc"

RDEPENDS:${PN} += ""

inherit rpm
