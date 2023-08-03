SUMMARY = "Make posters and banners with TeX"
DESCRIPTION = "The package offers macros for making posters and banners with \
TeX. It is compatible with most TeX macro formats, including \
Plain TeX, LaTeX, AmSTeX, and AmS-LaTeX. The package creates a \
poster as huge box, which is then distributed over as many \
printer pages as necessary. The only special requirement is \
that your printer not be bothered by text that lies off the \
page. This is true of most printers, including laser printers \
and PostScript printers."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn18305"

RPM_NAME = "texlive-poster-mac-2023.209.1.1svn18305-53.1.noarch.rpm"
RPM_HASH = "296e89427ca65487f5d98a8133ad043c4d0dac172e2ec11306329c46c707c8f44a0540494d9b7dad5a2c8632eaf96996776453da0da5c9e22bc0e61f94f9030e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-poster.sty \
tex-poster.tex \
texlive-poster-mac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
