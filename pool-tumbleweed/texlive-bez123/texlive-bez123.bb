SUMMARY = "Support for Bezier curves"
DESCRIPTION = "Provides additional facilities in a picture environment for \
drawing linear, cubic, and rational quadratic Bezier curves \
(standard LaTeX only offers non-rational quadratic splines). \
Provides a package multiply that provides a command for \
multiplication of a length without numerical overflow."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn15878"

RPM_NAME = "texlive-bez123-2023.201.1.1bsvn15878-53.1.noarch.rpm"
RPM_HASH = "267af68ab8782f4aa3e8eacb9aa212b399d2f956fe28862352b3f89d5105f38f21e7dc77ca3ec412b0bfe28b90bbe9d7b434172a1d217626bc437a1d3e942a80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bez123.sty) \
tex(multiply.sty) \
texlive-bez123"
RDEPENDS:${PN} += "/bin/sh \
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
