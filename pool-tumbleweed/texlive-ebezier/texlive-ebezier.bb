SUMMARY = "Device independent picture environment enhancement"
DESCRIPTION = "Ebezier is a device independent extension for the standard \
picture environment. Linear, quadratic, and cubic bezier curves \
are supplied in connection with higher level circle drawing \
commands. Additionally some macros for the calculation of curve \
lenghts are part of this package."
LICENSE = "LPPL-1.0"

PV = "2023.201.4svn15878"

RPM_NAME = "texlive-ebezier-2023.201.4svn15878-53.2.noarch.rpm"
RPM_HASH = "1841688b1e8cb81cc56e45ff61a8504c319746718c21fcb84c43ccfbceba7a18ae8ecb3c956148b6b3e1a29183643141140a30ee8928a46702770ba0541a94d7"
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
