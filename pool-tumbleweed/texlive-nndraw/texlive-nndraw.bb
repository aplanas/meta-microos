SUMMARY = "Draw neural networks"
DESCRIPTION = "With this package you can create fully connected neural \
networks in a simple and efficient way."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn59674"

RPM_NAME = "texlive-nndraw-2023.201.1.0svn59674-54.1.noarch.rpm"
RPM_HASH = "339724c700bd660d374194a67d22fb1237d97dd2368b05a3bf131c5dcb0735d62b8822a442319ed57331e6311f4518e0e410438bcddb4ee3fad9ccf786969c78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nndraw.sty \
texlive-nndraw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
