SUMMARY = "Typeset Chinese chess with l3draw"
DESCRIPTION = "This LaTeX3 package based on l3draw provides macros and an \
environment for Chinese chess manual writing."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn63276"

RPM_NAME = "texlive-chinesechess-2023.209.1.2.0svn63276-54.1.noarch.rpm"
RPM_HASH = "53e12f7961d82b76ad8f8e66e426f7742171a5147776c2dfd596ce361f83e58db25ba1be84547cc565c6b5a4758a27cff26d633bf9e82c568ee96ed7038b8163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chinesechess.sty \
texlive-chinesechess"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3draw.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
