SUMMARY = "Extended LaTeX page cross-references with varioref and zref-clever"
DESCRIPTION = "This package offers a compatibility layer for varioref to be \
used alongside zref-clever. It provides \\z... counterparts to \
varioref's main reference commands, each of which essentially \
does some (scoped) setup for varioref, then calls the original \
one."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.7svn65453"

RPM_NAME = "texlive-zref-vario-2023.201.0.0.1.7svn65453-52.2.noarch.rpm"
RPM_HASH = "33c2b00d8c49bb841a78caaf067bdb6ce22b4cf6e43568e62db0870fb55866c3040c867acdccde3b00c2287fb3b335a6074390da375035d813ed1d133180b720"
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
