SUMMARY = "Light weight template for creating school submissions using LaTeX"
DESCRIPTION = "This package is for students creating school submissions using \
LaTeX. It is especially suitable for math, physics, statistics \
and the like. It can easily be used for creating exercises, \
too."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn48255"

RPM_NAME = "texlive-handin-2023.201.0.0.1.1svn48255-53.1.noarch.rpm"
RPM_HASH = "0e897fcff7ab6a8558e8a8ff0db867028efaf1984f1073746d44eb5ab23ddd08c575653015b4de5c964511831b3d616b7e8f1e14e00046b8945464adb67561be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-handin.sty \
texlive-handin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-bm.sty \
tex-esint.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-iflang.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-mathtools.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-scrextend.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
