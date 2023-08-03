SUMMARY = "Plot graphs with TikZ abbreviations"
DESCRIPTION = "This is a LaTeX package that provides TikZ-based macros to make \
it easy to draw graphs. The macros provided in this package are \
just abbreviations for TikZ codes, which can be complicated; \
but using the package will hopefully make drawing easier, \
especially when drawing repeatedly. The macros were chosen and \
developed with an emphasis on drawing graphs in economics. The \
package depends on TikZ, xparse, and expl3."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn64537"

RPM_NAME = "texlive-tzplot-2023.209.2.1svn64537-53.1.noarch.rpm"
RPM_HASH = "f302e69dd591317cb5f913213d382f0f4d06f5785c461095256596d49ece4972ce5c47b8e965cde9ba2e55f226eb02480e9e640bb6bf77a5fd1c8865eb9aaf31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tzplot.sty \
texlive-tzplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
