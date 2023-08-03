SUMMARY = "XMU thesis style"
DESCRIPTION = "This class is designed for XMU thesis's writing."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn56614"

RPM_NAME = "texlive-xmuthesis-2023.209.0.0.4.1svn56614-53.1.noarch.rpm"
RPM_HASH = "748594a3d993bdb5b284cec07803b33477aa69379dc291e6e79d14455e05bd6cc725e6b327c82980fd4d0c8ef9609387dbef8d36ba42a46f1f88a643a0c68181"
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
