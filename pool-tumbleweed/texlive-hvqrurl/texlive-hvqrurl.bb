SUMMARY = "Insert a QR code in the margin"
DESCRIPTION = "This package allows to draw an URL as a QR code into the margin \
of a one- or twosided document. The following packages are \
loaded by default: qrcode, marginnote, url, xcolor and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.02svn59256"

RPM_NAME = "texlive-hvqrurl-2023.208.0.0.02svn59256-53.1.noarch.rpm"
RPM_HASH = "ef73a8495d18f7bfeea1686bde783253f33f7828fb3e17e4f9b149c02351db3de10cf54bd7388b333138d3eb237a98eb5ec6ebbcfa5a2fedd7391ff18f1a4f7e"
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
