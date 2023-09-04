SUMMARY = "Typesetting quantum circuits in a human-readable language"
DESCRIPTION = "This LaTeX package allows to quickly draw quantum circuits. It \
bridges the gap between the two groups of packages that already \
exist: those that use a logic-oriented custom language, which \
is then translated into TeX by means of an external program; \
and the pure TeX versions that mainly provide some macros to \
allow for an easier input. yquant is a pure-LaTeX solution -- \
i.e., it requires no external program -- that introduces a \
logic oriented language and thus brings the best of both worlds \
together. It builds on and interacts with TikZ, which brings an \
enourmous flexibility for customization of individual circuit."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.3svn65933"

RPM_NAME = "texlive-yquant-2023.209.0.0.7.3svn65933-53.2.noarch.rpm"
RPM_HASH = "16b664e470b505d633eee2fa5358843c3f839d86cc75fd0160c1e578427cef1c1613a8cdaf10535855691797644355c89ad46df2db69e04e842c53db72ab80be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yquant-circuit.tex \
tex-yquant-config.tex \
tex-yquant-draw.tex \
tex-yquant-env.tex \
tex-yquant-lang.tex \
tex-yquant-langhelper.tex \
tex-yquant-prepare.tex \
tex-yquant-registers.tex \
tex-yquant-shapes.tex \
tex-yquant-tools.tex \
tex-yquant.sty \
tex-yquantlanguage-groups.sty \
tex-yquantlanguage-qasm.sty \
texlive-yquant"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-trimspaces.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
