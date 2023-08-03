SUMMARY = "Draws bond graphs in LaTeX, using PGF/TikZ"
DESCRIPTION = "The package is used to draw bond graphs in LaTeX. It uses a \
recent version (3.0+) of PGF and TikZ for the drawing, hence, \
it is mainly a set of TikZ styles that makes the drawing of \
bond graphs easier. Compared to the bondgraph package this \
package relies more on TikZ styles and less on macros, to \
generate the drawings. As such it can be more flexible than \
his, but requires more TikZ knowledge of the user."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn36605"

RPM_NAME = "texlive-bondgraphs-2023.209.1.0.1svn36605-53.1.noarch.rpm"
RPM_HASH = "0d0f8f28daf10870802cc6ae4befa941eaab3e7359c641d251bcd700d05c52c76b9d920807017b0b10564738000c31c059a59064cd3d6b9bddb71163cb2a16c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bondgraphs.sty \
texlive-bondgraphs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-bm.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
