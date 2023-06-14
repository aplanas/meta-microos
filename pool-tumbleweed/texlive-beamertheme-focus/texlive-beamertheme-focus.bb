SUMMARY = "A minimalist presentation theme for LaTeX Beamer"
DESCRIPTION = "A presentation theme for LaTeX Beamer that aims at a clean and \
minimalist design, so to minimize distractions and put the \
focus directly on the content."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.3.0svn62551"

RPM_NAME = "texlive-beamertheme-focus-2023.201.3.3.0svn62551-53.1.noarch.rpm"
RPM_HASH = "48f0a817a6d85f05542dac35440290c943c40ae8af5d4a368984c8a8d1edc485a5e4113647e1de832b710da3a819cf18850ddc4047e56d98433daa5b40468dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemefocus.sty \
tex-beamerfontthemefocus.sty \
tex-beamerinnerthemefocus.sty \
tex-beamerouterthemefocus.sty \
tex-beamerthemefocus.sty \
texlive-beamertheme-focus"

RDEPENDS:${PN} += "/bin/sh \
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
