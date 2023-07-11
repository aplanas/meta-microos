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

RPM_NAME = "texlive-yquant-2023.201.0.0.7.3svn65933-52.2.noarch.rpm"
RPM_HASH = "4a20cbaefbdd45880018e4fada96cf2400ef15b34edc8c492d808950e6c3ec6d8a1169e08244ebbc42684d606a52102d3e96035eec13b3c7d050f919b9f690e2"
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
