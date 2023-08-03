SUMMARY = "Typeset theses for Sapienza-University, Rome"
DESCRIPTION = "The class will typeset Ph.D., Master, and Bachelor theses that \
adhere to the publishing guidelines of the Sapienza University \
of Rome."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.1svn63810"

RPM_NAME = "texlive-sapthesis-2023.209.5.1svn63810-54.1.noarch.rpm"
RPM_HASH = "f976728d6d0f07c986667e3fe743293c5570c10590606227b9ebf0687d6b1362e30983036a2e3edfccda1edf6593acc83a7881c9164dfc021e996dacbf206bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sapthesis.cls \
texlive-sapthesis"

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
