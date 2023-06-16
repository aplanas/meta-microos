SUMMARY = "Macros to insert playing cards"
DESCRIPTION = "This package provides macros to insert playing cards, single, \
or hand, or random-hand, Poker or French Tarot or Uno, from png \
files."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.3svn66190"

RPM_NAME = "texlive-jeuxcartes-2023.201.0.0.2.3svn66190-55.1.noarch.rpm"
RPM_HASH = "ca3bdb053cc3ee5dd447295422930dbbf439a2907b5e72a9c7dac224d063e115b4adde18187fec6924f0079d1505aba54b309f6fa48a98e3553e3ae88fd5933c"
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
