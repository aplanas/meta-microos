SUMMARY = "Ridgeway's fonts"
DESCRIPTION = "Fonts (as Metafont source) for Old English, Indic languages in \
Roman transliteration and Puget Salish (Lushootseed) and other \
Native American languages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn22459"

RPM_NAME = "texlive-wnri-2023.209.svn22459-54.1.noarch.rpm"
RPM_HASH = "41d488d94fdee2244724abee5aee8dde6c511602a0676fa6189d878dda6869d442adafef1c5893d532b5b243f6662e6b7d83069552bf57b247d440235e371751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wnindic.map \
tex-wnrib10.tfm \
tex-wnrib8.tfm \
tex-wnribi10.tfm \
tex-wnrii10.tfm \
tex-wnrii8.tfm \
tex-wnrir10.tfm \
tex-wnrir8.tfm \
tex-wnris10.tfm \
tex-wnris8.tfm \
tex-wnrit10.tfm \
tex-wnrit8.tfm \
texlive-wnri"

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
