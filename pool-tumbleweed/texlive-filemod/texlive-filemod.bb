SUMMARY = "Provide file modification times, and compare them"
DESCRIPTION = "The package provides macros to read and compare the \
modification dates of files. The files may be .tex files, \
images or other files (as long as they can be found by LaTeX). \
It uses the \\pdffilemoddate primitive of pdfLaTeX to find the \
file modification date as PDF date string, parses the string \
and returns the value to the user. The package will also work \
for DVI output with recent versions of the LaTeX compiler which \
uses pdfLaTeX in DVI mode. The functionality is provided by \
purely expandable macros or by faster but non-expandable ones."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn64967"

RPM_NAME = "texlive-filemod-2023.209.1.2svn64967-53.1.noarch.rpm"
RPM_HASH = "a192075912eda7738be9614172bd9e66d186034c347fda7a1406e21bd23686846732adc741fc0be2f31f9bcca1ecc9c326cdef0d3fe287284821ee605bdf4e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-filemod-expmin.sty \
tex-filemod-expmin.tex \
tex-filemod.sty \
tex-filemod.tex \
texlive-filemod"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
