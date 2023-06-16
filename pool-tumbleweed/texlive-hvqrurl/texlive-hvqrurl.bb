SUMMARY = "Insert a QR code in the margin"
DESCRIPTION = "This package allows to draw an URL as a QR code into the margin \
of a one- or twosided document. The following packages are \
loaded by default: qrcode, marginnote, url, xcolor and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn59256"

RPM_NAME = "texlive-hvqrurl-2023.201.0.0.02svn59256-52.1.noarch.rpm"
RPM_HASH = "a2efccdc2d3784fd050cdbe9eb43c17da58bfd1d8c2d8c68492a7afc1993d181cdf9cfd17b74b876a16705780786155f74cf801a31b525cfe03cc2d1c618a71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvqrurl.sty \
texlive-hvqrurl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-marginnote.sty \
tex-qrcode.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
