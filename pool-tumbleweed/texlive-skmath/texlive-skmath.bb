SUMMARY = "Extensions to the maths command repertoir"
DESCRIPTION = "The package provides a selection of new maths commands and \
improved re-definitions of existing commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5asvn52411"

RPM_NAME = "texlive-skmath-2023.201.0.0.5asvn52411-57.1.noarch.rpm"
RPM_HASH = "103757e90faeed82aa43b0b531a2f4b9d0136a90546b28db62979629537825d4aef64c1fbf5fb5e3fc8ab3032b95024be2873feaad2decc28726313640b067a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skmath.sty \
texlive-skmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-expl3.sty \
tex-isomath.sty \
tex-l3keys2e.sty \
tex-mathtools.sty \
tex-xfrac.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
