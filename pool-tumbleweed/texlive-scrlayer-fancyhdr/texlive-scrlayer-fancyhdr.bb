SUMMARY = "Combining package fancyhdr with KOMA-Script's scrlayer"
DESCRIPTION = "This LaTeX package uses KOMA-Script's scrlayer to redefine the \
page styles of package fancyhdr. This allows the combination of \
features of fancyhdr with features of scrlayer. Before \
KOMA-Script v3.33 scrlayer-fancyhdr was part of KOMA-Script \
itself."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.2svn63844"

RPM_NAME = "texlive-scrlayer-fancyhdr-2023.209.0.0.2.2svn63844-54.1.noarch.rpm"
RPM_HASH = "5bbac9c8b1475dd7e1b09cabdc781cef31583355467efc0ad5dc1cf0118dc51e14fcb34aad928f329967b60a3191e43d3bbb9f7ae69274c340a26d9c096f74fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scrlayer-fancyhdr.sty \
texlive-scrlayer-fancyhdr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-scrlayer.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
