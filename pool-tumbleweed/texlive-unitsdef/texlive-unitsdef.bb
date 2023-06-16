SUMMARY = "Typesetting units in LaTeX"
DESCRIPTION = "Many packages for typesetting units have been written for use \
in LaTeX2e. Some define macros to typeset a lot of units but do \
not suit to the actual font settings, some make the characters \
needed available but do not predefine any unit. This package \
tries to comply with both requirements. It predefines common \
units, defines an easy to use interface to define new units and \
changes the output concerning to the surrounding font settings."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-unitsdef-2023.201.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "4d6bdf6ca04bb1e4b6a7ecd3cf68011c7a2ec87d7396049f1a58ce404822c43d369057c749d620ea325d1980452e5d3aa785371c5171a7ce0c5a503d0d1c743e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ampabbrv.cfg \
tex-enerabbr.cfg \
tex-freqabbr.cfg \
tex-lengabbr.cfg \
tex-molabbrv.cfg \
tex-timeabbr.cfg \
tex-unitsdef.sty \
tex-volabbrv.cfg \
tex-voltabbr.cfg \
tex-weigabbr.cfg \
texlive-unitsdef"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-fontenc.sty \
tex-textcomp.sty \
tex-units.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
