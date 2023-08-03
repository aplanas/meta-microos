SUMMARY = "Creating Venn diagrams with TikZ"
DESCRIPTION = "The package assists generation of simple two- and three-set \
Venn diagrams for lectures or assignment sheets. The package \
requires the TikZ package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn47952"

RPM_NAME = "texlive-venndiagram-2023.209.1.2svn47952-54.1.noarch.rpm"
RPM_HASH = "9b1b66696c681c3a8a02ca6ab784043f3229b0142dc9f3e5ae90ce41cebfcff04dfce790771358387c04dbd53a16adb240230d31794f3cdec4851a8d65beb6dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-venndiagram.sty \
texlive-venndiagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
