SUMMARY = "Spell numbers in words (Italian)"
DESCRIPTION = "Sometimes we need to say 'Capitolo primo' or 'Capitolo uno' \
instead of 'Capitolo 1', that is, spelling the number in words \
instead of the usual digit form. This package provides support \
for spelling out numbers in Italian words, both in cardinal and \
in ordinal form."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-itnumpar-2023.209.1.0svn15878-56.1.noarch.rpm"
RPM_HASH = "28000c5df41539d91406d723aff0a34bd5b72e7e48a66a68e0a097242267dc378a5433941f86f3568825a44c64018e7e18c0421f6d79f91446ba202907d93ecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-itnumpar.sty \
texlive-itnumpar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
