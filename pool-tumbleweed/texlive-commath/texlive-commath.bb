SUMMARY = "Mathematics typesetting support"
DESCRIPTION = "Provides a range of differential, partial differential and \
delimiter commands, together with a \\fullfunction (function, \
with both domain and range, and function operation) and various \
reference commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn15878"

RPM_NAME = "texlive-commath-2023.209.0.0.3svn15878-54.1.noarch.rpm"
RPM_HASH = "c50eebf069d16318ed97ec10b027c83e06bc829bb251d3f9fd220fea7d57f01b7a32c2d764d56d26c5037b56c4baabdd64714160921f0f64d0cf555ed90fd888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-commath.sty \
texlive-commath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
