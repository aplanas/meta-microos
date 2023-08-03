SUMMARY = "LaTeX style for typesetting strategic games"
DESCRIPTION = "Formats strategic games. For a 2x2 game, for example, the \
input: \\begin{game}{2}{2} &$L$ &$M$\\\\ $T$ &$2,2$ &$2,0$\\\\ $B$ \
&$3,0$ &$0,9$ \\end{game} produces output with (a) boxes around \
the payoffs, (b) payoff columns of equal width, and (c) payoffs \
vertically centered within the boxes. Note that the game \
environment will not work in the argument of another command."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.15svn30959"

RPM_NAME = "texlive-sgame-2023.209.2.15svn30959-54.1.noarch.rpm"
RPM_HASH = "757d2abf84db3badddc7f9f39baf9f413a5a75448dd2d4bfabc5aa04b7bc2a6d3eb2d3ceaa529586179cee27550fae682d941273d95525e2b46b2fea9d3b94d6"
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
