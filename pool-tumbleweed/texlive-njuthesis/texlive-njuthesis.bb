SUMMARY = "LaTeX thesis template for Nanjing University"
DESCRIPTION = "The njuthesis class is intended for typesetting Nanjing \
University dissertations with LaTeX, providing support for \
bachelor, master, and doctoral theses as well as postdoctoral \
reports. Compilation of this class requires either XeLaTeX or \
LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn65546"

RPM_NAME = "texlive-njuthesis-2023.201.1.1.2svn65546-54.1.noarch.rpm"
RPM_HASH = "15b4011ee85fec467063ea8cea5326b75ebd51bbf914788c2a4bd0e61b0915598c905c1a378d5ef0ab17e66e07cda9127a723345eccca9c96ca459c9e5dd31d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-njuthesis-graduate.def \
tex-njuthesis-postdoctoral.def \
tex-njuthesis-undergraduate.def \
tex-njuthesis.cls \
texlive-njuthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-biblatex.sty \
tex-circledtext.sty \
tex-emptypage.sty \
tex-l3keys2e.sty \
tex-lua-ul.sty \
tex-njuvisual.sty \
tex-ntheorem.sty \
tex-pifont.sty \
tex-tabularray.sty \
tex-unicode-math.sty \
tex-xeCJKfntef.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
