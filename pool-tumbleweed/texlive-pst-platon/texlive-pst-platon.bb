SUMMARY = "Platonic solids in PSTricks"
DESCRIPTION = "The package adds to PSTricks the ability to draw 3-dimensional \
views of the five Platonic solids."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn16538"

RPM_NAME = "texlive-pst-platon-2023.201.0.0.01svn16538-53.2.noarch.rpm"
RPM_HASH = "c8ee5b0c83b6b61758b9df370d056cb9f3af0de7f2f334b3ff84832807f9671410424f3311582b528444e50937593309436e15e47d59be8187495c900dd00965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-platon.sty \
texlive-pst-platon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-3d.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
