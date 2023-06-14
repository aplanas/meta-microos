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

PV = "2023.201.0.0.7.3svn65933"

RPM_NAME = "texlive-yquant-2023.201.0.0.7.3svn65933-52.1.noarch.rpm"
RPM_HASH = "eddc60acca1e608e4b17239e19923cdb737153d5e1a640a5171ea772cfda35985742cc62ddc557503ee578a8b7619aa942b03600560fc8474706af6b06bb9100"
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

RDEPENDS:${PN} += "/bin/sh \
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
