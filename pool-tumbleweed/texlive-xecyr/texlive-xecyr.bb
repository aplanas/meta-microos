SUMMARY = "Using Cyrillic languages in XeTeX"
DESCRIPTION = "Helper tools for using Cyrillic languages with XeLaTeX and \
babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn54308"

RPM_NAME = "texlive-xecyr-2023.209.1.2svn54308-53.2.noarch.rpm"
RPM_HASH = "1a160bc9d71eaf3c0e662335bfb30034d00a38f8086d3bc1a94ef8dbe254188ce293f3a35fd63cb491df343a192db96a72a67d64d44b1e7605cbf3f006334b71"
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
