SUMMARY = "Jump between DVI and TeX files"
DESCRIPTION = "Provides a \\special insertion into generated .dvi files \
allowing one to jump from the .dvi file to the .tex source and \
back again (given a .dvi viewer that supports this, such as Yap \
or xdvi version 22.38 or later). This was originally written by \
Aleksander Simonic, the author of the WinEdt shell."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.6svn15878"

RPM_NAME = "texlive-srcltx-2023.209.1.6svn15878-58.1.noarch.rpm"
RPM_HASH = "ea9e2f05f84ffe63079366635f5edbce099e4573d2ab2e96c444745361be439351e7b5c0dee13f986e74e8baf72df83b9349dd328b322051fef57ab876c7ebf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-srcltx.sty \
tex-srctex.sty \
texlive-srcltx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
