SUMMARY = "Documentation for texlive-skills"
DESCRIPTION = "This package includes the documentation for texlive-skills"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn56734"

RPM_NAME = "texlive-skills-doc-2023.209.1.0.0svn56734-58.1.noarch.rpm"
RPM_HASH = "e2a7bcbf9b728d6e98a2c04df606f28e51c8ee95952354c2f761d3fb8b1ef996b86243214affbcee2eac1fe21ce3d979e74cff2e1c306e4ac4b951e582349146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skills-doc"

RDEPENDS:${PN} += ""

inherit rpm
