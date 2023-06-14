SUMMARY = "Typeset business cards, index cards and flash cards easily"
DESCRIPTION = "A LaTeX package for typesetting business cards, index cards, \
and flash cards in an easy and flexible way, optionally also \
the reverse side. You will have to furnish the paper size, the \
desired size of your card, the printable area of your printer, \
and the design of the card. Everything else is taken care of by \
elzcards."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.60svn51894"

RPM_NAME = "texlive-elzcards-2023.201.1.60svn51894-53.1.noarch.rpm"
RPM_HASH = "03b16b1b29964a5fb8baec5af83c884e00aee5ca286240dbf2bdbef88fb2b88173885a41c041e36b388e466390ce51f325e2408510b6e9af05ec192b6bcf98c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elzcards.sty \
texlive-elzcards"

RDEPENDS:${PN} += "/bin/sh \
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
