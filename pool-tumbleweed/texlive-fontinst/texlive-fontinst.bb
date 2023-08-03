SUMMARY = "Help with installing fonts for TeX and LaTeX"
DESCRIPTION = "TeX macros for converting Adobe Font Metric files to TeX metric \
and virtual font format. Fontinst helps mainly with the number \
crunching and shovelling parts of font installation. This means \
in practice that it creates a number of files which give the \
TeX metrics (and related information) for a font family that \
(La)TeX needs to do any typesetting in these fonts. Fontinst \
furthermore makes it easy to create fonts containing glyphs \
from more than one base font, taking advantage of (e.g.) \
'expert' font sets. Fontinst cannot examine files to see if \
they contain any useful information, nor automatically search \
for files or work with binary file formats; those tasks must \
normally be done manually or with the help of some other tool, \
such as the pltotf and vptovf programs."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.933svn62517"

RPM_NAME = "texlive-fontinst-2023.209.1.933svn62517-53.1.noarch.rpm"
RPM_HASH = "8f5a13ac7e3f298261ffc1f4f911dfb9fd1c017096ed293875b815e0cd62552cb7eb8b3ca906b41eef1088cf13f287976ce6b939d3b015bf692b78b28ec330b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bbox.sty \
tex-cfntinst.sty \
tex-csc2x.tex \
tex-csckrn2x.tex \
tex-finstmsc.sty \
tex-fontdoc.sty \
tex-fontinst.sty \
tex-multislot.sty \
tex-osf2x.tex \
tex-xfntinst.sty \
texlive-fontinst"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-fontinst-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
