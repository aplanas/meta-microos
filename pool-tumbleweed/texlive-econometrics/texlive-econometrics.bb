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

PV = "2023.209.1.0svn39396"

RPM_NAME = "texlive-econometrics-2023.209.1.0svn39396-54.2.noarch.rpm"
RPM_HASH = "fd3f5c6b112bc34753c4b17c7bbc44181ae3a4d449ff475ab0fe707b5fa5566848a57327f725e81e422da760903834485f5f0536b9fd0ff6a7c43c1dee12fe4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-econometrics.sty \
texlive-econometrics"

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
