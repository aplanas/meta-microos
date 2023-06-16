SUMMARY = "(No) Persian hyphenation patterns"
DESCRIPTION = "Prevent hyphenation in Persian."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54568"

RPM_NAME = "texlive-hyphen-farsi-2023.201.svn54568-52.1.noarch.rpm"
RPM_HASH = "1ea99dc8c418919408d4613f7e20225a0777c4def12f27ca70d08cee2c7be2a4153e674e8a349dbcd439eefbbbcdf65b9f8b1d9dbd74ecaaddf98ec0f1ef7b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-farsi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
