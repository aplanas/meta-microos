SUMMARY = "Drawing time-line diagrams"
DESCRIPTION = "Macros to produce time line diagrams. Interfaces for Plain TeX, \
ConTeXt and LaTeX are provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn26700"

RPM_NAME = "texlive-chronosys-2023.209.1.2svn26700-54.1.noarch.rpm"
RPM_HASH = "628cabb712b5b5062b7b1ebea1ed2bbf6dbe94f616f78194a4ecfabbeac56da45e549e0bcbe9e080f3990af0e58922daa6bcededac02f2afdab053d07d5cd0d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chronosys.sty \
tex-chronosys.tex \
tex-chronosyschr.tex \
tex-x-chronosys.tex \
texlive-chronosys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
