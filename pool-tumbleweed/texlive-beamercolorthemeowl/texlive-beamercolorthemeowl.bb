SUMMARY = "A flexible beamer color theme to maximize visibility"
DESCRIPTION = "This package provides a flexible dark or light colour theme \
designed for maximum readability in environments where most \
themes fall flat. Main features: Dark color theme for \
presenting in low-light conditions. Optional light color theme \
for presenting in bright ambient light. Redefines color names \
'red', 'green', 'blue', 'yellow' to values that are visible \
when displayed by certain projectors, particularly those with a \
very bright green channel and dim red and blue channels. This \
behaviour can be optionally disabled, with the provided colours \
also available as 'OwlRed', 'OwlGreen', etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn40105"

RPM_NAME = "texlive-beamercolorthemeowl-2023.209.0.0.1.1svn40105-54.1.noarch.rpm"
RPM_HASH = "cdc5287995da3e4938d09930308dc8a14610631052d98db06bdff0c49c7687439a05b5cd18677c67994330b8cb849759f5f32c00f90b47ac68d34988c6aa8ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeowl.sty \
texlive-beamercolorthemeowl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
