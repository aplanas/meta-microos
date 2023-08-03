SUMMARY = "Iteration in LaTeX"
DESCRIPTION = "The package provides a command \\forloop for doing iteration in \
LaTeX macro programming."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.3.0svn15878"

RPM_NAME = "texlive-forloop-2023.209.3.0svn15878-53.1.noarch.rpm"
RPM_HASH = "e0fdb2c90d7b9d3ac052bd7a826e3ca4b5c2dcbc235cf59bc18d115833811e40ec45631ce048900356ed716bfc5702684229868b545d2c1dbeafa5bc4e3e3843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-forloop.sty \
texlive-forloop"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
