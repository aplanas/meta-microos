SUMMARY = "Knuth's 'manual' fonts"
DESCRIPTION = "Metafont (by Donald Knuth) and Adobe Type 1 (by Taco Hoekwater) \
versions of the font containing the odd symbols Knuth uses in \
his books. LaTeX support is available using the manfnt package"
LICENSE = "SUSE-TeX"

PV = "2023.208.svn45777"

RPM_NAME = "texlive-manfnt-font-2023.208.svn45777-53.1.noarch.rpm"
RPM_HASH = "ab827b3782f18faf7e737290f6f4e309238be98b27c2c0748e57adae284b8385b469f2a75a813300453877913c8a3569992a0468ff66fcf595db87d0832f86de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-manfnt.map \
texlive-manfnt-font"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-manfnt-font-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
