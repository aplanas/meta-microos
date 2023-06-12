SUMMARY = "Override existing labels"
DESCRIPTION = "The package allows the user to override existing labels (for \
example, those generated automatically)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0msvn65846"

RPM_NAME = "texlive-undolabl-2023.201.1.0msvn65846-53.1.noarch.rpm"
RPM_HASH = "71d1d078f6cd6e7e41002cd839ed025f390b0b33a95ed525f7e9e15ba06361300014948e441210f55f28d96c2a6f53ceec0fe2fad4efc9906aaf50ae433cfaa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(undolabl.sty) \
texlive-undolabl"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
