SUMMARY = "Device independent picture environment enhancement"
DESCRIPTION = "Ebezier is a device independent extension for the standard \
picture environment. Linear, quadratic, and cubic bezier curves \
are supplied in connection with higher level circle drawing \
commands. Additionally some macros for the calculation of curve \
lenghts are part of this package."
LICENSE = "LPPL-1.0"

PV = "2023.209.4svn15878"

RPM_NAME = "texlive-ebezier-2023.209.4svn15878-54.1.noarch.rpm"
RPM_HASH = "088016f64b41ea40d29f8dca18421ba5b8aab9a21b17d243e60b2e6a95a791cf107dad4ec2f1bbf3149055670c0b81782550407024bafcb97b74b5a9dd8c4337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ebezier.sty \
texlive-ebezier"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
