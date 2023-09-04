SUMMARY = "XMU thesis style"
DESCRIPTION = "This class is designed for XMU thesis's writing."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn56614"

RPM_NAME = "texlive-xmuthesis-2023.209.0.0.4.1svn56614-53.2.noarch.rpm"
RPM_HASH = "0c680f63c4700eee9831a679d0c9a0588ada174de09baaa6bef0e344cc5802453aedb214bf637c19d8166b5c03c7783e4cbb9a7fdebd3197e1608cea1d8a21cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xmulogo.sty \
tex-xmuthesis.cls \
texlive-xmuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-microtype.sty \
tex-nag.sty \
tex-scrlfile.sty \
tex-tikz.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
tex-xeCJKfntef.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
