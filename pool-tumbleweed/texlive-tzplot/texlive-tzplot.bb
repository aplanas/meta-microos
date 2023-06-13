SUMMARY = "Plot graphs with TikZ abbreviations"
DESCRIPTION = "This is a LaTeX package that provides TikZ-based macros to make \
it easy to draw graphs. The macros provided in this package are \
just abbreviations for TikZ codes, which can be complicated; \
but using the package will hopefully make drawing easier, \
especially when drawing repeatedly. The macros were chosen and \
developed with an emphasis on drawing graphs in economics. The \
package depends on TikZ, xparse, and expl3."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn64537"

RPM_NAME = "texlive-tzplot-2023.201.2.1svn64537-52.1.noarch.rpm"
RPM_HASH = "a44e5330ca39de027f048b132414d3c5956f755085fa588adc83c98952a390d005363ca0e94ab61ebafb0c3f6cd32424e44fd35827a714d55496ef13f16bb613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tzplot.sty) \
texlive-tzplot"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(tikz.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
