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

RPM_NAME = "texlive-econometrics-2023.201.1.0svn39396-53.2.noarch.rpm"
RPM_HASH = "f69494aabce8e13f5658794314461d56706cf4a3d48a429bdf0f32f8d9fee1abf92f6a85a99024e1896b1bff0922b892f23b203a31c36553fd954157d1a75660"
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
