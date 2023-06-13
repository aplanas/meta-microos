SUMMARY = "Documentation for texlive-arev"
DESCRIPTION = "This package includes the documentation for texlive-arev"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-arev-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "170556102cb7f5e34f5c56c7a8e2d8a5a82b4e2bb5662ea66de3c9d2e04f53d057df695bbf2e779519e19dd409a50fd186ac6793e3388c32d8b081771d467dfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arev-doc"

RDEPENDS:${PN} += ""

inherit rpm
