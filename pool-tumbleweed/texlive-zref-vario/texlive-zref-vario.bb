SUMMARY = "Extended LaTeX page cross-references with varioref and zref-clever"
DESCRIPTION = "This package offers a compatibility layer for varioref to be \
used alongside zref-clever. It provides \\z... counterparts to \
varioref's main reference commands, each of which essentially \
does some (scoped) setup for varioref, then calls the original \
one."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.7svn65453"

RPM_NAME = "texlive-zref-vario-2023.209.0.0.1.7svn65453-53.1.noarch.rpm"
RPM_HASH = "d5c68a0a01a03f0a733bf4002b4145e81a9f27e316338c1bfe05261946b08cbfa44c4e3f999381974f9586e0a14494c433d189609209c9d60734d326552e7550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zref-vario.sty \
texlive-zref-vario"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-varioref.sty \
tex-zref-clever.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tools \
texlive-zref-clever"

inherit rpm
