SUMMARY = "Fancy QR-Codes with TikZ"
DESCRIPTION = "A simple package to create fancy QR-codes with the help of the \
qrcode package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn64182"

RPM_NAME = "texlive-fancyqr-2023.209.1.1svn64182-53.1.noarch.rpm"
RPM_HASH = "ba15107bffb122473acb7db7fee564789c11885ada41d9c203af3d04278797c67c37e8d95420507062f9839e9797cd96321310a720d01c76795b445cb7e181b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancyqr.sty \
texlive-fancyqr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-qrcode.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
