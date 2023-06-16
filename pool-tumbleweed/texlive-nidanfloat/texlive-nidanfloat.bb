SUMMARY = "Bottom placement option for double float in two column mode (nidan-kumi)"
DESCRIPTION = "This package enables a bottom placement option for double \
floats in two column mode (nidan-kumi). It was originally part \
of the Japanese pLaTeX bundle and is now distributed as a \
separate package because it supports all LaTeX formats."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn48295"

RPM_NAME = "texlive-nidanfloat-2023.201.svn48295-54.1.noarch.rpm"
RPM_HASH = "54737e074beb03ef87b3054a8a326e9b54f28a4bab0860e3c1842be95fda84d563201558a8c6151023b1ffaee19ad06b8006ca6085ff730ea4189e5da8020d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nidanfloat.sty \
texlive-nidanfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
