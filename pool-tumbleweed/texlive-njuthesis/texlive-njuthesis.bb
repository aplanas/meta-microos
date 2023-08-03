SUMMARY = "LaTeX thesis template for Nanjing University"
DESCRIPTION = "The njuthesis class is intended for typesetting Nanjing \
University dissertations with LaTeX, providing support for \
bachelor, master, and doctoral theses as well as postdoctoral \
reports. Compilation of this class requires either XeLaTeX or \
LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn65546"

RPM_NAME = "texlive-njuthesis-2023.209.1.1.2svn65546-55.1.noarch.rpm"
RPM_HASH = "99c1594a9ca801fde240a0445ea0b451bed2ab3b21ce796de2b1f42ae10716ff11e31e4e65fa28878074c9928fc35c061510d8046f5a8cd3898bf524a747df36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-njuthesis-graduate.def \
tex-njuthesis-postdoctoral.def \
tex-njuthesis-undergraduate.def \
tex-njuthesis.cls \
texlive-njuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
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
