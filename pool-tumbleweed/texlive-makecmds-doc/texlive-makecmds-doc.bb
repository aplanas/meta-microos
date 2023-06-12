SUMMARY = "Documentation for texlive-makecmds"
DESCRIPTION = "This package includes the documentation for texlive-makecmds"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-makecmds-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "19a7ff42f0c428ab21615bbc944c0871118514cb332301445e007e10b4c02cb666149bdd6971984b91930cb7bef8fe3185ddeb71ba7cc00728a8ec69e34a86eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makecmds-doc"
RDEPENDS:${PN} += ""

inherit rpm
