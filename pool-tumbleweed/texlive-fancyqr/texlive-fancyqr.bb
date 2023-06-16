SUMMARY = "Fancy QR-Codes with TikZ"
DESCRIPTION = "A simple package to create fancy QR-codes with the help of the \
qrcode package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn64182"

RPM_NAME = "texlive-fancyqr-2023.201.1.1svn64182-52.1.noarch.rpm"
RPM_HASH = "e512858b1e98a7d00b17b525d2b0b01363670ef64ffa1bac60faa1935302e24b4e77ed28eaf533834a0d2a53b3b3cd7b62cf8c89eecd5cef65f7437e0103265b"
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
