SUMMARY = "Display logos related to Nanjing University"
DESCRIPTION = "The njuvisual package collects standard colors and logos \
related to Nanjing University, saves the vector logos as TikZ \
pictures and provides a user-friendly interface to display them \
in documents and beamers."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn65261"

RPM_NAME = "texlive-njuvisual-2023.201.0.0.3.0svn65261-54.1.noarch.rpm"
RPM_HASH = "4b05cb23d50134ac252651a89ef07284713f1c37ca00f78b2e32306a701857715226da093f5df95844d0473e09c23bd8ee3b36df50ddf3d95c5325e6d70d0d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-njuvisual-emblem-ai.def \
tex-njuvisual-emblem-chem.def \
tex-njuvisual-emblem-cs.def \
tex-njuvisual-emblem-dii.def \
tex-njuvisual-emblem-eng.def \
tex-njuvisual-emblem-nju.def \
tex-njuvisual-emblem-physics.def \
tex-njuvisual-emblem-software.def \
tex-njuvisual-motto-nju.def \
tex-njuvisual-name-en-nju.def \
tex-njuvisual-name-zh-nju.def \
tex-njuvisual-spirit-nju.def \
tex-njuvisual.sty \
texlive-njuvisual"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
