SUMMARY = "XMU thesis style"
DESCRIPTION = "This class is designed for XMU thesis's writing."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn56614"

RPM_NAME = "texlive-xmuthesis-2023.201.0.0.4.1svn56614-52.2.noarch.rpm"
RPM_HASH = "2daefe3e15af60d547a0b594a18235d94c31bb119e24d80dc48d739b15ac839f69dca73ef53f64887401fbd6bab2929a8158adbfbc1657ba6e824dbd6de10de9"
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
