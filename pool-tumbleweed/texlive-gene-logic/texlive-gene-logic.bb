SUMMARY = "Typeset logic formulae, etcetera"
DESCRIPTION = "The package provides a facility to typeset certain logic \
formulae. It provides an environment like eqnarray, a \
newtheorem-like environment (NewTheorem), and several macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn15878"

RPM_NAME = "texlive-gene-logic-2023.209.1.4svn15878-53.1.noarch.rpm"
RPM_HASH = "64ff876aec82e654fb207cfc6cf43f1453a7b0e2b369e2ddde2d0daf4b3abde63004af70b260b6272e0ad08b1c4b8e5a2bf1eac5a0d647e9ef87641cd0d83f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gn-logic14.sty \
texlive-gene-logic"

RDEPENDS:${PN} += "/usr/bin/sh \
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
