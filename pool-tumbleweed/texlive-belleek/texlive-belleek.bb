SUMMARY = "Free replacement for basic MathTime fonts"
DESCRIPTION = "This package replaces the original MathTime fonts, not \
MathTime-Plus or MathTime Professional (the last being the only \
currently available commercial bundle)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn66115"

RPM_NAME = "texlive-belleek-2023.209.svn66115-54.1.noarch.rpm"
RPM_HASH = "709fd573f4cebdbb8e3c2c7e39cf6effbcfac5b197236afb755cab0a0e3223578690ed634cb2601226b133ee3ecfbb6cd12f31850a95f6c96d7a9fb4207cdb47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-belleek.map \
texlive-belleek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-belleek-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
