SUMMARY = "Jump between DVI and TeX files"
DESCRIPTION = "Provides a \\special insertion into generated .dvi files \
allowing one to jump from the .dvi file to the .tex source and \
back again (given a .dvi viewer that supports this, such as Yap \
or xdvi version 22.38 or later). This was originally written by \
Aleksander Simonic, the author of the WinEdt shell."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.6svn15878"

RPM_NAME = "texlive-srcltx-2023.201.1.6svn15878-57.1.noarch.rpm"
RPM_HASH = "700c61f0eff65f58c9825f3fceabd0a1be0582ddd6244c440062ebdb3e08c579bcc4026ff515d0c4589cc9478b3403eec8bde9d0d9af01b811301968eacbe6a2"
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
