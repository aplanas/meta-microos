SUMMARY = "Documentation for texlive-stdpage"
DESCRIPTION = "This package includes the documentation for texlive-stdpage"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn15878"

RPM_NAME = "texlive-stdpage-doc-2023.209.0.0.6svn15878-58.1.noarch.rpm"
RPM_HASH = "6693a66852894d519937d0992d6259601e612d499dab854a6bade1c352266cc413dae452d9b5f689b94a1d9dae9e58f88825fdc4ae61b647da437b4cfc69d147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stdpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
