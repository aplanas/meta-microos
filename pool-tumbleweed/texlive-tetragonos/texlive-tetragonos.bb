SUMMARY = "Four-Corner codes of Chinese characters"
DESCRIPTION = "This is a XeLaTeX package for mapping Chinese characters to \
their codes in the Four-Corner Method."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn49732"

RPM_NAME = "texlive-tetragonos-2023.209.1svn49732-55.1.noarch.rpm"
RPM_HASH = "a3ee110517777dfeeef4ecfa7bb885f9e8bd431f7d175863d9a5e3159c4609642be18569e3207e65e67cce74a268c72a8830cc704bd7215b7905b750fe357b05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tetragonos-database.def \
tex-tetragonos.sty \
texlive-tetragonos"

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
