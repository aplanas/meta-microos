SUMMARY = "Drawing time-line diagrams"
DESCRIPTION = "Macros to produce time line diagrams. Interfaces for Plain TeX, \
ConTeXt and LaTeX are provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn26700"

RPM_NAME = "texlive-chronosys-2023.201.1.2svn26700-53.1.noarch.rpm"
RPM_HASH = "d2ec9dcc101eee88f8118e93163aabe8f7143fa25aa74f850ebe4ed98d648cb245046ca3a39ba06cf0b238b45958ca95dd832752ece46d2afecd099c53ac3fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chronosys.sty) \
tex(chronosys.tex) \
tex(chronosyschr.tex) \
tex(x-chronosys.tex) \
texlive-chronosys"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
