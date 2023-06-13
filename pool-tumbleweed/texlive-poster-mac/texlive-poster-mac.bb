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

PV = "2023.201.1.1svn18305"

RPM_NAME = "texlive-poster-mac-2023.201.1.1svn18305-52.1.noarch.rpm"
RPM_HASH = "0c03326e1c5504f995738fc44ae1029d233846a4ac4696d8e4f3a751aca9685bdf8dc216bd1955589504de64fdba1011e3018f41c26a2c0be14ec00796a2ab51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(poster.sty) \
tex(poster.tex) \
texlive-poster-mac"

RDEPENDS:${PN} += "/bin/sh \
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
