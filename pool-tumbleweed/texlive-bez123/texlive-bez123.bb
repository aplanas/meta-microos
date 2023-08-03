SUMMARY = "Support for Bezier curves"
DESCRIPTION = "Provides additional facilities in a picture environment for \
drawing linear, cubic, and rational quadratic Bezier curves \
(standard LaTeX only offers non-rational quadratic splines). \
Provides a package multiply that provides a command for \
multiplication of a length without numerical overflow."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn15878"

RPM_NAME = "texlive-bez123-2023.209.1.1bsvn15878-54.1.noarch.rpm"
RPM_HASH = "657763091b1d7692a4f032e58643ff5f0fb5cea9eca309d2b9d991c4ef42d40b468fb3fdfa625a78b5d6d66680492f0a5bef07fe68ed3d1c41ec34365577a47e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bez123.sty \
tex-multiply.sty \
texlive-bez123"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
