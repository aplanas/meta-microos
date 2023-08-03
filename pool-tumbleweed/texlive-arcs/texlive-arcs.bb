SUMMARY = "Draw arcs over and under text"
DESCRIPTION = "The package provides two commands for placing an arc over \
(\\overarc) or under (\\underarc) a piece of text. (The text may \
be up to three letters long.) The commands generate an \\hbox, \
and may be used both in text and in maths formulae."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn15878"

RPM_NAME = "texlive-arcs-2023.209.1svn15878-55.1.noarch.rpm"
RPM_HASH = "f872ec13860e7b4606d0ccaed6486941121780e0b15685f569837caf6176c5aa353295982f150b280b0039654dc0d7e82a00f9e856492fda73f285a14c774ce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arcs.sty \
texlive-arcs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-relsize.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
