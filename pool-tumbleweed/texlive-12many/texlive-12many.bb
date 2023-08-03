SUMMARY = "Generalising mathematical index sets"
DESCRIPTION = "In the discrete branches of mathematics and the computer \
sciences, it will only take some seconds before you're faced \
with a set like {1,...,m}. Some people write $1\\ldotp\\ldotp m$, \
others $\\{j:1\\leq j\\leq m\\}$, and the journal you're submitting \
to might want something else entirely. The 12many package \
provides an interface that makes changing from one to another a \
one-line change."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn15878"

RPM_NAME = "texlive-12many-2023.209.0.0.3svn15878-55.1.noarch.rpm"
RPM_HASH = "98f00ac4220c1b0b96f9e0d6b75f48ff614ed50150742105b375bf2f326971d6944893bc990a5553ec30af3e12d34052f8840666f2cdb672e8bf63bda5a7a286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-12many.sty \
texlive-12many"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
