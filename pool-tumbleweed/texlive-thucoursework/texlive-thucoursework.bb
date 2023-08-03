SUMMARY = "Coursework template for Tsinghua University"
DESCRIPTION = "A LaTeX package for students of Tsinghua University to write \
coursework more efficiently. It can also be used by students \
from other universities. Note that the package itself does not \
import the ctex package; to use it with Chinese writing, see \
example file ithw.tex for details."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn56435"

RPM_NAME = "texlive-thucoursework-2023.209.2.6svn56435-55.1.noarch.rpm"
RPM_HASH = "32a3b6caec88403fe0b32ae6e8762d15960e49cc80a6557ff00122373db8f6315e76756b77abc1638fd3e0662efab67e8a32b055e4ba3e56696511298cf77064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iidef.sty \
texlive-thucoursework"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amsthm.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
