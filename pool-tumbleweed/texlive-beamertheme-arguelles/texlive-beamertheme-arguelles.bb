SUMMARY = "Simple, typographic beamer theme"
DESCRIPTION = "Arguelles is a beamer theme that helps you create beautiful \
presentations. It aims for simplicity and readability by \
following best practices of graphic design. The layout is \
elegant but subtle, so as to keep the audience's attention on \
your content. This is brought to life by Alegreya, one of the \
53 Fonts of the Decade selected by the Association \
Typographique Internationale (2011)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn66358"

RPM_NAME = "texlive-beamertheme-arguelles-2023.209.2.1.0svn66358-54.1.noarch.rpm"
RPM_HASH = "fc0ecc52cb3a8254e570b745cc57d048f40f077122ed89cf25e38b0642547c506fb1e4bd2d113d1487fb07f215b7b54c8566a87931f99cfe3affe3dd3a41cc6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeArguelles.sty \
tex-beamerfontthemeArguelles.sty \
tex-beamerinnerthemeArguelles.sty \
tex-beamerouterthemeArguelles.sty \
tex-beamerthemeArguelles.sty \
texlive-beamertheme-arguelles"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-Alegreya.sty \
tex-AlegreyaSans.sty \
tex-booktabs.sty \
tex-cancel.sty \
tex-colortbl.sty \
tex-csvsimple.sty \
tex-dcolumn.sty \
tex-enumitem.sty \
tex-eulervm.sty \
tex-fontawesome5.sty \
tex-fontenc.sty \
tex-inputenc.sty \
tex-makecell.sty \
tex-mathalpha.sty \
tex-microtype.sty \
tex-opencolor.sty \
tex-parskip.sty \
tex-pgfplots.sty \
tex-tikz.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
