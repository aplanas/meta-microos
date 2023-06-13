SUMMARY = "Documentation for texlive-biblatex-apa6"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-apa6"
LICENSE = "LPPL-1.0"

PV = "2023.201.8.5svn56209"

RPM_NAME = "texlive-biblatex-apa6-doc-2023.201.8.5svn56209-53.1.noarch.rpm"
RPM_HASH = "654348bdd9458eff0eefc87c5b3a56693fcbcb419c39ae4292e87683a3f8fdb29522196afee4b77441b8daaab32fcf73896a3ccec757e877bce7444cbc4af88d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-apa6-doc"

RDEPENDS:${PN} += ""

inherit rpm
