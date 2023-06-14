SUMMARY = "Spell numbers in words (Italian)"
DESCRIPTION = "Sometimes we need to say 'Capitolo primo' or 'Capitolo uno' \
instead of 'Capitolo 1', that is, spelling the number in words \
instead of the usual digit form. This package provides support \
for spelling out numbers in Italian words, both in cardinal and \
in ordinal form."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-itnumpar-2023.201.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "1735210ecdba659c9804819726b725002324bf218121770ac9979fe93057034e174fc78a45553df7610c3ffee620513374e99a95a90391944523eb16fc5d1bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-itnumpar.sty \
texlive-itnumpar"

RDEPENDS:${PN} += "/bin/sh \
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
