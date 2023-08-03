SUMMARY = "Draw electrical networks with TikZ"
DESCRIPTION = "The package provides a set of macros for naturally typesetting \
electrical and (somewhat less naturally, perhaps) electronic \
networks. It is designed as a tool that is easy to use, with a \
lean syntax, native to LaTeX, and directly supporting PDF \
output format. It has therefore been based on the very \
impressive PGF/TikZ package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6.1svn65785"

RPM_NAME = "texlive-circuitikz-2023.209.1.6.1svn65785-54.1.noarch.rpm"
RPM_HASH = "ff5813c7be5680dc0ea3e20ddeab11face5e2b5d3268c3d1820a0dc1d2feebf7792971171aba8ab641511e593eaa52e64043d9737485461574a6a41cf99fd175"
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

RDEPENDS:${PN} += "/usr/bin/sh \
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
