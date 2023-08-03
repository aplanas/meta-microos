SUMMARY = "Print chess boards"
DESCRIPTION = "This package offers commands to print chessboards. It can print \
partial boards, hide pieces and fields, color the boards and \
put various marks on the board. It has a lot of options to \
place pieces on the board. Using exotic pieces (e.g., for fairy \
chess) is possible. The documentation includes an example of an \
animated chessboard, for those whose PDF viewer can display \
animations."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn56833"

RPM_NAME = "texlive-chessboard-2023.209.1.9svn56833-54.1.noarch.rpm"
RPM_HASH = "a4524f14eebc2a3e898ddd772551b33e467a65e28511ce2586d329399b817070bc5603f2c234ef18fca777ca6a15ff52885a2f7d270c1d5dd52e690505274f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UF-chessboard-documentation.sty \
tex-chessboard-keys-main.sty \
tex-chessboard-keys-pgf.sty \
tex-chessboard-pgf.sty \
tex-chessboard.sty \
texlive-chessboard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-animate.sty \
tex-array.sty \
tex-babel.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-chessfss.sty \
tex-csquotes.sty \
tex-doc.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fourier.sty \
tex-helvet.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-makeidx.sty \
tex-microtype.sty \
tex-pst-node.sty \
tex-showexpl.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
