SUMMARY = "Draws bond graphs in LaTeX, using PGF/TikZ"
DESCRIPTION = "The package is used to draw bond graphs in LaTeX. It uses a \
recent version (3.0+) of PGF and TikZ for the drawing, hence, \
it is mainly a set of TikZ styles that makes the drawing of \
bond graphs easier. Compared to the bondgraph package this \
package relies more on TikZ styles and less on macros, to \
generate the drawings. As such it can be more flexible than \
his, but requires more TikZ knowledge of the user."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn36605"

RPM_NAME = "texlive-bondgraphs-2023.201.1.0.1svn36605-52.1.noarch.rpm"
RPM_HASH = "a2c8da88c3ffc053b93cba33ae65138554b5e874deecc616d69a2bb3f634581d4ac13192335a69b837d324734b280319dc960764551e3969f360bfb4cec888ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bondgraphs.sty \
texlive-bondgraphs"

RDEPENDS:${PN} += "/bin/sh \
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
