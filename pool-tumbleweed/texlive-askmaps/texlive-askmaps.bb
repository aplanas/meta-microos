SUMMARY = "Typeset American style Karnaugh maps"
DESCRIPTION = "The package provides 1, 2, 3, 4 and 5 variable Karnaugh maps, \
in the style used in numerous American textbooks on digital \
design. The package draws K-maps where the most significant \
input variables are placed on top of the columns and the least \
significant variables are placed left of the rows."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn56730"

RPM_NAME = "texlive-askmaps-2023.201.0.0.2svn56730-53.1.noarch.rpm"
RPM_HASH = "3aedc1236af5982e8cf7b8fef3f33c3f0c11e6515c078d75d4b9eb7a3f7197cac7a3f115357a76a191367dd0702e64dc6b9d18e5daf8f124d0c51be7bbdb7037"
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
