SUMMARY = "Using Cyrillic languages in XeTeX"
DESCRIPTION = "Helper tools for using Cyrillic languages with XeLaTeX and \
babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn54308"

RPM_NAME = "texlive-xecyr-2023.209.1.2svn54308-53.1.noarch.rpm"
RPM_HASH = "19faf0b389d946097d8ec3be80af76b520ccb4655dace6c4873d5ddd169bcb36a1ed2b784ad88f2890f74608e031376531f66b11bc1ae3ce01497f4a077cd58f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xecyr.sty \
texlive-xecyr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-luatextra.sty \
tex-misccorr.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
