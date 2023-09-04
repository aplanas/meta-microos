SUMMARY = "Typeset business cards, index cards and flash cards easily"
DESCRIPTION = "A LaTeX package for typesetting business cards, index cards, \
and flash cards in an easy and flexible way, optionally also \
the reverse side. You will have to furnish the paper size, the \
desired size of your card, the printable area of your printer, \
and the design of the card. Everything else is taken care of by \
elzcards."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.60svn51894"

RPM_NAME = "texlive-elzcards-2023.209.1.60svn51894-54.2.noarch.rpm"
RPM_HASH = "a60b33af885e63fe3492bde3a2554d8348e9bdcd2c4ac9b9c92872e6cfe9fd9843043bccd17554ea7fe39a48a9f44b24e4b09dfb91fc4be04ddaf92261d4879c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elzcards.sty \
texlive-elzcards"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-keyval.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
