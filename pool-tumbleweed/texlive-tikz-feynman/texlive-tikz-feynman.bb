SUMMARY = "Feynman diagrams with TikZ"
DESCRIPTION = "This is a LaTeX package allowing Feynman diagrams to be easily \
generated within LaTeX with minimal user instructions and \
without the need of external programs. It builds upon the TikZ \
package and leverages the graph placement algorithms from TikZ \
in order to automate the placement of many vertices. \
tikz-feynman allows fine-tuned placement of vertices so that \
even complex diagrams can still be generated with ease."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn56615"

RPM_NAME = "texlive-tikz-feynman-2023.209.1.1.0svn56615-53.1.noarch.rpm"
RPM_HASH = "502d5533d654e2c0f64c87ebcf30125b48dff119bde36df8b6f7bd8769585f475849082f07b67e8a5949d9e9eb44da2fbe955e924e637cd6c4e95274d4a1f47c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-feynman.sty \
tex-tikzfeynman.keys.code.tex \
tex-tikzlibraryfeynman.code.tex \
texlive-tikz-feynman"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
