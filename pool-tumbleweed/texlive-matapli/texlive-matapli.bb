SUMMARY = "Class for the french journal 'MATAPLI'"
DESCRIPTION = "This is a class for the french journal 'MATAPLI' of the Societe \
de Mathematiques Appliquees et Industrielles (SMAI)."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2.0svn62632"

RPM_NAME = "texlive-matapli-2023.208.1.2.0svn62632-53.1.noarch.rpm"
RPM_HASH = "4be9f80e3f590d6ba8982cb2a852a39acaddf9623d79d25f87609a21f88407e9c90598da49ac8c92b98cb640d234607bb1d98a92c2dcc39c724ee98ced193f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-matapli.cls \
texlive-matapli"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-bclogo.sty \
tex-biblatex.sty \
tex-book.cls \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-enumitem.sty \
tex-etoc.sty \
tex-eurosym.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-latexsym.sty \
tex-lettrine.sty \
tex-libertine.sty \
tex-libertinus-otf.sty \
tex-marvosym.sty \
tex-mathtools.sty \
tex-multicol.sty \
tex-subfig.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
