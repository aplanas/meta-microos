SUMMARY = "Documentation for texlive-biblatex-ieee"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ieee"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3fsvn61243"

RPM_NAME = "texlive-biblatex-ieee-doc-2023.201.1.3fsvn61243-53.1.noarch.rpm"
RPM_HASH = "09640b3d65801435fedcfc8c38dd95adf0b2b2f968a07400358d0b70fa7ddab3b415eb8023bc2f38ee22e2173535601d744d80820b73c413fcd05d064be0a8c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-ieee-doc"
RDEPENDS:${PN} += ""

inherit rpm
