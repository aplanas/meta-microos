SUMMARY = "A minimalist presentation theme for LaTeX Beamer"
DESCRIPTION = "A presentation theme for LaTeX Beamer that aims at a clean and \
minimalist design, so to minimize distractions and put the \
focus directly on the content."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.3.0svn62551"

RPM_NAME = "texlive-beamertheme-focus-2023.209.3.3.0svn62551-54.1.noarch.rpm"
RPM_HASH = "0ec1d08ac27070a1c887d4ab2b5f6631f89b526b1a885c4a762d46ab4f86e22e3300de8edd63d784ddd7200196050f12be7dc2cddf8dff4529910a5f0194673a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemefocus.sty \
tex-beamerfontthemefocus.sty \
tex-beamerinnerthemefocus.sty \
tex-beamerouterthemefocus.sty \
tex-beamerthemefocus.sty \
texlive-beamertheme-focus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraMono.sty \
tex-FiraSans.sty \
tex-appendixnumberbeamer.sty \
tex-bookmark.sty \
tex-etoolbox.sty \
tex-firamath-otf.sty \
tex-fontenc.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
