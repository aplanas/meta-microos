SUMMARY = "Documentation for texlive-tableaux"
DESCRIPTION = "This package includes the documentation for texlive-tableaux"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42413"

RPM_NAME = "texlive-tableaux-doc-2023.201.svn42413-57.1.noarch.rpm"
RPM_HASH = "191affbfba0cd74d1b1d813d9dc9517ca12576d5963f6c3447256123696d40ac68feee9ba7f19e29b12d7d6311cb7fff7263371b3a2f23eeff9453687875d832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tableaux-doc:fr) \
texlive-tableaux-doc"

RDEPENDS:${PN} += ""

inherit rpm
