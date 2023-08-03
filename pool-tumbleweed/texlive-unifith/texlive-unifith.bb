SUMMARY = "Typeset theses for University of Florence (Italy)"
DESCRIPTION = "The package provides a class to typeset Ph.D., Master, and \
Bachelor theses that adhere to the publishing guidelines of the \
University of Florence (Italy)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn60698"

RPM_NAME = "texlive-unifith-2023.209.1.6svn60698-54.1.noarch.rpm"
RPM_HASH = "496433a7950a8314bf19d4fe557cdd60c1f5591272ab732aeb5073e3a42b3decea93f37fc9947c6a9554e504c7c0ad436c19c7f1ff2dba600d179cbf3c37adea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unifith.cls \
texlive-unifith"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-book.cls \
tex-booktabs.sty \
tex-caption.sty \
tex-color.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-lmodern.sty \
tex-textcomp.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
