SUMMARY = "Page organisation, modelled on CSS facilities"
DESCRIPTION = "The package provides the means for LaTeX to implement a grid \
system as known from CSS grid systems. The facility is useful \
for creating box layouts as used in brochures."
LICENSE = "Apache-1.0"

PV = "2023.201.0.0.3.0svn32981"

RPM_NAME = "texlive-grid-system-2023.201.0.0.3.0svn32981-53.2.noarch.rpm"
RPM_HASH = "1924fed1d9d0c5ac99ee139df749876b63f8005fbc0d3c2f9b87b0f28655cc8d624f2edd115a49b51a39815c55d95fb2ee70338f2615434e7389d8016312e139"
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
