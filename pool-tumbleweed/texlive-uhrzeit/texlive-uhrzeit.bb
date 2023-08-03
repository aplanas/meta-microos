SUMMARY = "Time printing, in German"
DESCRIPTION = "The primary goal of this package is to facilitate formats and \
ranges of times as formerly used in Germany. A variety of \
printing formats are available."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2csvn39570"

RPM_NAME = "texlive-uhrzeit-2023.209.0.0.2csvn39570-54.1.noarch.rpm"
RPM_HASH = "611ed86a9de81b9cf17a53013cb1c5dc504d79841c2fbc731b3705f5a7e947f22d49393b5f62a96296dcc8251b08b5d4cedec4a74da4dc45f5cf4b56c6d6dbce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uhrzeit.sty \
texlive-uhrzeit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-soul.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
