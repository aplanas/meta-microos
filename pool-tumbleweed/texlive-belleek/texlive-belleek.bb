SUMMARY = "Free replacement for basic MathTime fonts"
DESCRIPTION = "This package replaces the original MathTime fonts, not \
MathTime-Plus or MathTime Professional (the last being the only \
currently available commercial bundle)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn66115"

RPM_NAME = "texlive-belleek-2023.201.svn66115-53.1.noarch.rpm"
RPM_HASH = "35ec5533b2da12d7541ee51ebf33f567f312ef7d31fdd05d78915f0f1ce53216a55fdfb6420862fd832d881467e0801ebb132abda517a3dbcc9bc77ff4233448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(belleek.map) \
texlive-belleek"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-belleek-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
