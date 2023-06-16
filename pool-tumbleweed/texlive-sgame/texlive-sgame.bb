SUMMARY = "LaTeX style for typesetting strategic games"
DESCRIPTION = "Formats strategic games. For a 2x2 game, for example, the \
input: \\begin{game}{2}{2} &$L$ &$M$\\\\ $T$ &$2,2$ &$2,0$\\\\ $B$ \
&$3,0$ &$0,9$ \\end{game} produces output with (a) boxes around \
the payoffs, (b) payoff columns of equal width, and (c) payoffs \
vertically centered within the boxes. Note that the game \
environment will not work in the argument of another command."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.15svn30959"

RPM_NAME = "texlive-sgame-2023.201.2.15svn30959-53.1.noarch.rpm"
RPM_HASH = "d73cff2c971748c86832f76e403600cc3e98403bad3ae68d9042058872bd1fae0bbe966e6e6831285aa1b9dbdd477421f1d50048dfd4ac1bf5cff718bb3a3777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sgame.sty \
tex-sgamevar.sty \
texlive-sgame"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
