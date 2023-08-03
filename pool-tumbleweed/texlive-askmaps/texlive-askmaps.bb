SUMMARY = "Typeset American style Karnaugh maps"
DESCRIPTION = "The package provides 1, 2, 3, 4 and 5 variable Karnaugh maps, \
in the style used in numerous American textbooks on digital \
design. The package draws K-maps where the most significant \
input variables are placed on top of the columns and the least \
significant variables are placed left of the rows."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn56730"

RPM_NAME = "texlive-askmaps-2023.209.0.0.2svn56730-54.1.noarch.rpm"
RPM_HASH = "2159ef6afcea0e0ce54621b6447bc156cbbad4d669657944ff72591cae84054e183cf638b2d14cbb1d32ee4f72568c5b3c1b00f343daf6ab1604975a9ef56cf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-askmaps.sty \
texlive-askmaps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
