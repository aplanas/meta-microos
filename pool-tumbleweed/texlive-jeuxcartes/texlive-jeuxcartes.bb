SUMMARY = "Macros to insert playing cards"
DESCRIPTION = "This package provides macros to insert playing cards, single, \
or hand, or random-hand, Poker or French Tarot or Uno, from png \
files."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.3svn66190"

RPM_NAME = "texlive-jeuxcartes-2023.209.0.0.2.3svn66190-56.1.noarch.rpm"
RPM_HASH = "04f919b76f6721f872bea982abe17f14ceb350f873d5e4868b334614aea0002278eee5e4893cde07fbfe361332304d1e07d029839e3b76f93f88b21754e03a18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-JeuxCartes.sty \
texlive-jeuxcartes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-listofitems.sty \
tex-pgffor.sty \
tex-pifont.sty \
tex-randomlist.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xfp.sty \
tex-xinttools.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
