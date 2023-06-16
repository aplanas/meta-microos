SUMMARY = "Deal with database, loop, and random in order to build personalized exercises"
DESCRIPTION = "The main aim of this package is to work on lists, especially \
with random operations. The hidden aim is to build a personnal \
collection of exercises with different data for each pupil."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn45281"

RPM_NAME = "texlive-randomlist-2023.201.1.3svn45281-53.1.noarch.rpm"
RPM_HASH = "96b33f598f61ff29b425773bf52f095fc4d7eda54d1be580d68c54d6c92b5c1b5b27c1fa266feb449124f45b13cbb84b2657aab631a353c2fca0a3c83be2d66b"
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
