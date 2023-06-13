SUMMARY = "Knuth's 'manual' fonts"
DESCRIPTION = "Metafont (by Donald Knuth) and Adobe Type 1 (by Taco Hoekwater) \
versions of the font containing the odd symbols Knuth uses in \
his books. LaTeX support is available using the manfnt package"
LICENSE = "SUSE-TeX"

PV = "2023.201.svn45777"

RPM_NAME = "texlive-manfnt-font-2023.201.svn45777-52.1.noarch.rpm"
RPM_HASH = "17b0758aa9b7dc51d4f09b59bfe1d60b2d249694087e0b414a95fdbee3e5622e80b1865be92c9aa3d643139ae874c7e113420d73feac0a94ce9f13afebda9cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(manfnt.map) \
texlive-manfnt-font"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-manfnt-font-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
