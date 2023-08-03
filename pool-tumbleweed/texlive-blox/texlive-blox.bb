SUMMARY = "Draw block diagrams, using TikZ"
DESCRIPTION = "This package, along with TikZ, will typeset block diagrams for \
use with programming and control theory. It is an English \
translation of the schemabloc package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.51svn57949"

RPM_NAME = "texlive-blox-2023.209.2.51svn57949-53.1.noarch.rpm"
RPM_HASH = "42d9f54fd97acb03036663e25918381c5d187f5e5e57b40d90252f40b55a51924de6632d1ef3e857bcd2e140feace1e68922d53859412e5c1f74f9923f6a59ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blox.sty \
texlive-blox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pgffor.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
