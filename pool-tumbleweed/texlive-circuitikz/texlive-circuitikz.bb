SUMMARY = "Draw electrical networks with TikZ"
DESCRIPTION = "The package provides a set of macros for naturally typesetting \
electrical and (somewhat less naturally, perhaps) electronic \
networks. It is designed as a tool that is easy to use, with a \
lean syntax, native to LaTeX, and directly supporting PDF \
output format. It has therefore been based on the very \
impressive PGF/TikZ package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6.1svn65785"

RPM_NAME = "texlive-circuitikz-2023.201.1.6.1svn65785-53.1.noarch.rpm"
RPM_HASH = "a275af1c4591ad4ce0ec9802523ba4a70cce4e68e1515828e4b8b79e5102da479de21bb843a508576fa2c0a4cc9a1b25baf55985dbdc359d2fb00b9cbbf86db4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-circuitikz-0.4-body.tex \
tex-circuitikz-0.4.sty \
tex-circuitikz-0.6-body.tex \
tex-circuitikz-0.6.sty \
tex-circuitikz-0.7-body.tex \
tex-circuitikz-0.7.sty \
tex-circuitikz-0.8.3-body.tex \
tex-circuitikz-0.8.3.sty \
tex-circuitikz-0.9.3-body.tex \
tex-circuitikz-0.9.3.sty \
tex-circuitikz-0.9.6-body.tex \
tex-circuitikz-0.9.6.sty \
tex-circuitikz-1.0-body.tex \
tex-circuitikz-1.0.sty \
tex-circuitikz-1.1.2-body.tex \
tex-circuitikz-1.1.2.sty \
tex-circuitikz-1.2.7-body.tex \
tex-circuitikz-1.2.7.sty \
tex-circuitikz-1.4.6-body.tex \
tex-circuitikz-1.4.6.sty \
tex-circuitikz.sty \
tex-ctikzstyle-example.tex \
tex-ctikzstyle-legacy.tex \
tex-ctikzstyle-romano.tex \
tex-pgfcirc.defines.tex \
tex-pgfcircbipoles.tex \
tex-pgfcirccurrent.tex \
tex-pgfcircflow.tex \
tex-pgfcirclabel.tex \
tex-pgfcircmonopoles.tex \
tex-pgfcircmultipoles.tex \
tex-pgfcircpath.tex \
tex-pgfcircquadpoles.tex \
tex-pgfcircshapes.tex \
tex-pgfcirctripoles.tex \
tex-pgfcircutils.tex \
tex-pgfcircvoltage.tex \
tex-t-circuitikz-0.8.3.tex \
tex-t-circuitikz-0.9.3.tex \
tex-t-circuitikz-0.9.6.tex \
tex-t-circuitikz-1.0.tex \
tex-t-circuitikz-1.1.2.tex \
tex-t-circuitikz-1.2.7.tex \
tex-t-circuitikz-1.4.6.tex \
tex-t-circuitikz.tex \
texlive-circuitikz"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-siunitx.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
