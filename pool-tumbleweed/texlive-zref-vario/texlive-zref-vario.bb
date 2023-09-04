SUMMARY = "Extended LaTeX page cross-references with varioref and zref-clever"
DESCRIPTION = "This package offers a compatibility layer for varioref to be \
used alongside zref-clever. It provides \\z... counterparts to \
varioref's main reference commands, each of which essentially \
does some (scoped) setup for varioref, then calls the original \
one."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.7svn65453"

RPM_NAME = "texlive-zref-vario-2023.209.0.0.1.7svn65453-53.2.noarch.rpm"
RPM_HASH = "3493d8e502880bcb02ac8fc65c2a65512d334a65baf24b2644ed64821672d4bbb964731bd7b50931feceea0324393cb15f21d05cd132df3e4d12232e4c3994ae"
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
