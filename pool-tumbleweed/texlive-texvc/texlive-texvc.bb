SUMMARY = "Use MediaWiki LaTeX commands"
DESCRIPTION = "User MediaWiki LaTeX commands to copy and past formulae from \
MediaWiki to LaTeX documents."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn46844"

RPM_NAME = "texlive-texvc-2023.209.1.1svn46844-55.1.noarch.rpm"
RPM_HASH = "d5532ee11b243d6166fdd283cf3b5e6c2b74887d878dec631bf2b12e259cc6ddbd12c9ddb08d99aa1f666ac524d92514d3a3052a665a14f3249c5d59e832b79c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texvc.sty \
texlive-texvc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-cancel.sty \
tex-color.sty \
tex-eurosym.sty \
tex-teubner.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
