SUMMARY = "Utilities like DviToDvi, PSToPS, and LaCheck"
DESCRIPTION = "The LaCheck utility is a syntax checker for LaTeX documents. \
 \
The DviToDvi utilities are \
 \
dvibook       rearranges pages into book signatures, adds blank pages \
              as needed \
dviselect     selects pages and page ranges \
dvitodvi      performs general page rearrangement of selected pages \
dviconcat     concatenation of DVI files \
 \
Three simple scripts for scaling DIN A4 pages and rearranging two by \
two onto a DIN A4 page (a4toa5) are included. The number of pages must \
be even (which can be done by odd2even or dvibook)."
LICENSE = "GPL-2.0-or-later & LPPL-1.0 & LGPL-2.1-or-later"

PV = "2023.208"

RPM_NAME = "texlive-extratools-2023.208-60.1.noarch.rpm"
RPM_HASH = "531a9684b68af330b2fa16f547b9f662dbc04d9fd1978cf6d37ea08acfec26e05fa8abe3ce89f394de667787edbdd758758564b7fdddaee22445e5c1979e66ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extratools"

RDEPENDS:${PN} += "psutils \
texlive-dviasm \
texlive-dvidvi \
texlive-dvipng \
texlive-dvisvgm \
texlive-lacheck \
texlive-seetexk"

inherit rpm
