SUMMARY = "Typeset business cards, index cards and flash cards easily"
DESCRIPTION = "A LaTeX package for typesetting business cards, index cards, \
and flash cards in an easy and flexible way, optionally also \
the reverse side. You will have to furnish the paper size, the \
desired size of your card, the printable area of your printer, \
and the design of the card. Everything else is taken care of by \
elzcards."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.60svn51894"

RPM_NAME = "texlive-elzcards-2023.209.1.60svn51894-54.1.noarch.rpm"
RPM_HASH = "2e7a619acc758df799296402e7c5f87ba4d76edabae7be5ed1be26863ef02b211c561f662083722798c94022a8b97072f4de2637389cb9fbc25cf55aa7811d96"
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
