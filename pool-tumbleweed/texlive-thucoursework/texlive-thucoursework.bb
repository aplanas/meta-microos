SUMMARY = "Coursework template for Tsinghua University"
DESCRIPTION = "A LaTeX package for students of Tsinghua University to write \
coursework more efficiently. It can also be used by students \
from other universities. Note that the package itself does not \
import the ctex package; to use it with Chinese writing, see \
example file ithw.tex for details."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn56435"

RPM_NAME = "texlive-thucoursework-2023.201.2.6svn56435-54.1.noarch.rpm"
RPM_HASH = "dbecd843fefa93d07ca8c44c76c7c9215908552bd0b63ad1c6a9835669704e84bfe301cf2e5f65d276271033bf8b87361640fe8c8900da1e500b181b4d5aadce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iidef.sty \
texlive-thucoursework"

RDEPENDS:${PN} += "/bin/sh \
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
