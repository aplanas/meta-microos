SUMMARY = "Insert a QR code in the margin"
DESCRIPTION = "This package allows to draw an URL as a QR code into the margin \
of a one- or twosided document. The following packages are \
loaded by default: qrcode, marginnote, url, xcolor and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn59256"

RPM_NAME = "texlive-hvqrurl-2023.209.0.0.02svn59256-54.1.noarch.rpm"
RPM_HASH = "28cf3bb421153ab6abc050cd02f60b8c62b5d70b96b42ebb62199e6086b2b097cec48d5059001b883a8f2406c193520c2920d86b7eac5c82d94305fb137e72f0"
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
