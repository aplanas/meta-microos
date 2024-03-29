SUMMARY = "On-screen presentations for (almost) all formats"
DESCRIPTION = "The package creates slides for on-screen presentations based on \
PDF features without manipulating TeX's typesetting process. \
The presentation flow relies on PDF's abilities to display \
content step by step. Features include: Free positioning of \
anything anywhere in painted areas on the slide, as well as in \
the main textblock; Numerous attributes to control the layout \
and the presentation flow, from TeX's primitive dimensions to \
the visibility of steps; Feature inheritance from global to \
local settings, with intermediate types; Basic drawing \
facilities to produce symbols, e.g., for list items or buttons; \
Colours, transparency, shades, and pictures; Navigation with \
links, pop-up menus, and customizable bookmarks; Easy switch \
between presentation and handout; and PDF transitions. Besides \
the traditional documentation, the distribution includes visual \
documentation and six demo presentations ranging from geometric \
abstraction to classic style to silly video game. Lecturer is \
designed to work with all formats, but presently fails with \
ConTeXt MkIV (because of clashes in management of PDF objects, \
probably), works only with pdfTeX and LuaTeX for the time \
being, and requires texapi and yax, both v.1.02."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23916"

RPM_NAME = "texlive-lecturer-2023.209.svn23916-55.1.noarch.rpm"
RPM_HASH = "ab4e14937908232b962aed6adae92f6fdb65413b7f19ece8b2e77714bd0b17a50edde812fd6a5c328061caf91ea0b648b214c0796d293be39b1c3f5471fddfa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lecturer.sty \
tex-lecturer.tex \
tex-ltr-areas.tex \
tex-ltr-graphics.tex \
tex-ltr-job.tex \
tex-ltr-navigation.tex \
tex-ltr-slides.tex \
tex-ltr-steps.tex \
tex-t-lecturer.tex \
texlive-lecturer"

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
