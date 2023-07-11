SUMMARY = "Typeset business cards, index cards and flash cards easily"
DESCRIPTION = "A LaTeX package for typesetting business cards, index cards, \
and flash cards in an easy and flexible way, optionally also \
the reverse side. You will have to furnish the paper size, the \
desired size of your card, the printable area of your printer, \
and the design of the card. Everything else is taken care of by \
elzcards."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.60svn51894"

RPM_NAME = "texlive-elzcards-2023.201.1.60svn51894-53.2.noarch.rpm"
RPM_HASH = "4553f8178c8a6345a6b834f2b316694dd5792b07a55bd4415072bb0ea75af94c4542a4351e1da6e98f3d9dabb93d79d9845e3c6fb77708c48fcf43e135582105"
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
