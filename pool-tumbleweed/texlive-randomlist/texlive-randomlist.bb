SUMMARY = "Deal with database, loop, and random in order to build personalized exercises"
DESCRIPTION = "The main aim of this package is to work on lists, especially \
with random operations. The hidden aim is to build a personnal \
collection of exercises with different data for each pupil."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn45281"

RPM_NAME = "texlive-randomlist-2023.209.1.3svn45281-54.2.noarch.rpm"
RPM_HASH = "f39d88eef5466710615ee8c1667d66c7ea68008076f39fbb2748aa5d896e0bc2cf85c110f9c545c9a291ebe8ad6559f15a6ac31c61eeeeae89c862b1b66d9dca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-randomlist.sty \
tex-randomlist.tex \
texlive-randomlist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
