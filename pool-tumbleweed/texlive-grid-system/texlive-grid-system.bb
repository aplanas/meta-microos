SUMMARY = "Page organisation, modelled on CSS facilities"
DESCRIPTION = "The package provides the means for LaTeX to implement a grid \
system as known from CSS grid systems. The facility is useful \
for creating box layouts as used in brochures."
LICENSE = "Apache-1.0"

PV = "2023.209.0.0.3.0svn32981"

RPM_NAME = "texlive-grid-system-2023.209.0.0.3.0svn32981-54.2.noarch.rpm"
RPM_HASH = "a3b2a52684d62bacd5158a998fe0175652122d1a06908261e113bf824341569f306d064d7330cd79776d9346e204ed45a6606d53369fa8cff9672bec93f8e59a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grid-system.sty \
texlive-grid-system"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-environ.sty \
tex-forloop.sty \
tex-ifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
