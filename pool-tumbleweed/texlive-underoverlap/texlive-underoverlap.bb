SUMMARY = "Position decorations over and under expressions"
DESCRIPTION = "The package overcomes TeX's inherent limitations in commands \
that place decorations (such as braces) at arbirary positions \
over and under expressions, overlapping as necessary."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.1_r1svn29019"

RPM_NAME = "texlive-underoverlap-2023.209.0.0.0.1_r1svn29019-54.1.noarch.rpm"
RPM_HASH = "4de0d212f8c602da61d48ef6e25cf17e4b6c4a3c1a040498646d2abae6c7f482d75dab341e74554b956ad991ab5618884575dd15128affa9d5d560dd6b8dcb37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-underoverlap.sty \
texlive-underoverlap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-mathtools.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
