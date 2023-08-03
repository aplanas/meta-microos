SUMMARY = "A TikZ command set for structural mechanics drawings"
DESCRIPTION = "This package provides a collection of TikZ commands that allow \
users to draw basic elements in material/structural mechanics. \
It is thus possible to draw member forces, nodal \
forces/displacements, various boundary conditions, internal \
force distributions, etc."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn58985"

RPM_NAME = "texlive-structmech-2023.209.1.1svn58985-58.1.noarch.rpm"
RPM_HASH = "9ea8917f54f97dd20b4a15b0bb39ee6a1fe3c00aa26cedb253c31214e5342558a16f5ed4a3dc6a4da8881e7147f8c1cd682f3c239fff72bb45256626ba924e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-structmech.sty \
texlive-structmech"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
