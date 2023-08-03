SUMMARY = "Typesetting VDM in ASCII syntax"
DESCRIPTION = "The package is an extension for the listings package that \
provides a source code printer for LaTeX. This package defines \
new language definitions and listing environments for the three \
language dialects of the Vienna Development Method: VDM-SL, \
VDM-PP and VDM-RT. If one wants to typeset VDM with a \
mathematical syntax instead of the ASCII syntax used here one \
should use the vdm package instead"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56905"

RPM_NAME = "texlive-vdmlisting-2023.209.1.1svn56905-54.1.noarch.rpm"
RPM_HASH = "1dc1434877dc8d593852c7ef2fa594ecdeb99e1667cb40b84a8be7e3afd44c6351ae7044357095aec425f7b96e65f2042b9096e716b78a82e53a795827f57ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vdmlisting.sty \
texlive-vdmlisting"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-listings.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
