SUMMARY = "Documentation for texlive-hepparticles"
DESCRIPTION = "This package includes the documentation for texlive-hepparticles"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn35723"

RPM_NAME = "texlive-hepparticles-doc-2023.201.2.0svn35723-53.1.noarch.rpm"
RPM_HASH = "c8b86a859ccb17a3b620bbf5d192142dd0e4412d69e8bbafc2f39f1d859091d81c9ef6482599ed3fb7839c48d3ba205cd45a6cc3caa06b31378feb94c75f442c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepparticles-doc"
RDEPENDS:${PN} += ""

inherit rpm
