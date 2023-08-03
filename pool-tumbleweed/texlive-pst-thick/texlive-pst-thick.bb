SUMMARY = "Drawing very thick lines and curves"
DESCRIPTION = "The package supports drawing of very thick lines and curves in \
PSTricks, with various fillings for the body of the lines."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn16369"

RPM_NAME = "texlive-pst-thick-2023.209.1.0svn16369-54.1.noarch.rpm"
RPM_HASH = "609fbb7242db3be0dd6e1d8f7efbf0542501e0809cef1ec4c504c576ea8f1b30d41102ac700f3d9aee6c245a8f8e306b4fd9a7c1f83b134b8e60e40d43378ed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-thick.sty \
tex-pst-thick.tex \
texlive-pst-thick"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
