SUMMARY = "Defines some commands that simplify mathematic notation in economic and econometric writing"
DESCRIPTION = "Econometrics is a package that defines some commands that \
simplify mathematic notation in economic and econometrics \
writing. The commands are related to the notation of vectors, \
matrices, sets, calligraphic and roman letters statistical \
distributions constants and symbols matrix operators and \
statistical operators. The package is based on 'Notation in \
Econometrics: a proposal for a standard' by Karim Abadir and \
Jan R. Magnus, The Econometrics Journal (2002), 5, 76-90."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39396"

RPM_NAME = "texlive-econometrics-2023.201.1.0svn39396-53.1.noarch.rpm"
RPM_HASH = "3931689566a547fc1815cc5027e5d189243d744a808f12fe28192d20686d49387c14dd7f8255c7102e0434518b2293e0d410fe38ea7137964f6b938232a41fab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-econometrics.sty \
texlive-econometrics"

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
