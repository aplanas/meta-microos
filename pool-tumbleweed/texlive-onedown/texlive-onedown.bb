SUMMARY = "Typeset Bridge Diagrams"
DESCRIPTION = "This is a comprehensive package to draw all sorts of bridge \
diagrams, including hands (stand alone or arround a compass), \
bidding tables (stand alone or in connection with \
hands/compass), trick tables, and expert quizzes. Features: \
Works for all fontsizes from \\ssmall to \\HUGE. Different fonts \
for hands, bidding diagrams, compass, etc. are possible. \
Annotations to card and bidding diagrams. Automated check on \
consistency of suit and hands. Multilingual output of bridge \
terms. Extensive documentation: User manual, Reference manual, \
and Examples."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn59010"

RPM_NAME = "texlive-onedown-2023.209.1.6svn59010-55.1.noarch.rpm"
RPM_HASH = "2db419f053a3c787aa15011fdc715b126e3e083806705a732379e7b7a49c21ecf50a9c2f100dd33ca33dff2569ff849a3e9009a70b62d34dc096ff80bb2cd7ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-onedown.sty \
texlive-onedown"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
