SUMMARY = "A beamer theme that incorporates colours and fonts of Saint Petersburg State University"
DESCRIPTION = "This minimalistic beamer theme incorporates Saint Petersburg \
State University colours and fonts. It is suitable for both \
presentations and posters."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45877"

RPM_NAME = "texlive-beamertheme-saintpetersburg-2023.209.svn45877-54.1.noarch.rpm"
RPM_HASH = "29bae40f7a43d121fcb00582938187397d0014ec33e5aae3e09f56f7a52a8d43b52faf7eae566c6fc8f7ce821e8db26eb6576055b8906d18688c438b52749fbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeSaintPetersburg.sty \
tex-beamerfontthemeSaintPetersburg.sty \
tex-beamerthemeSaintPetersburg.sty \
texlive-beamertheme-saintpetersburg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraMono.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-ifxetex.sty \
tex-opensans.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
