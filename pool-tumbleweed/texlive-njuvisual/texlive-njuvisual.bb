SUMMARY = "Display logos related to Nanjing University"
DESCRIPTION = "The njuvisual package collects standard colors and logos \
related to Nanjing University, saves the vector logos as TikZ \
pictures and provides a user-friendly interface to display them \
in documents and beamers."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn65261"

RPM_NAME = "texlive-njuvisual-2023.209.0.0.3.0svn65261-55.1.noarch.rpm"
RPM_HASH = "d672c2a328c3f60426ca9fa8d39db06d8f2175293422c1e2272abbcdf55ec35e39a91beb588b971ff2885c719c58f1f0eff9aec2f4c81b5381832250925d44c3"
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
