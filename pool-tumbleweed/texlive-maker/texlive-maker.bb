SUMMARY = "Include Arduino or Processing code in LaTeX documents"
DESCRIPTION = "The first version of the package allows to include Arduino or \
Processing code using three different forms: writing the code \
directly in the LaTeX document writing Arduino or Processing \
commands in line with the text calling to Arduino or Processing \
files All these options support the syntax highlighting of the \
oficial IDE."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn44823"

RPM_NAME = "texlive-maker-2023.208.1.0svn44823-53.1.noarch.rpm"
RPM_HASH = "6f7f8c04c8d2a2f0a050d0572170bf93b0db487c90e494f59534eb24e6ac49a79cca18655245eccc64d1ad5b0fcfef6d6bc354259102f81ee565abf818822d37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-maker.sty \
texlive-maker"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-tcolorbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
