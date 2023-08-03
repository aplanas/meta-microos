SUMMARY = "Bottom placement option for double float in two column mode (nidan-kumi)"
DESCRIPTION = "This package enables a bottom placement option for double \
floats in two column mode (nidan-kumi). It was originally part \
of the Japanese pLaTeX bundle and is now distributed as a \
separate package because it supports all LaTeX formats."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn48295"

RPM_NAME = "texlive-nidanfloat-2023.209.svn48295-55.1.noarch.rpm"
RPM_HASH = "a8d89c5818ff55fbdd562991cfb77200cbec65a67f9904bd66fefcfdbd989c54b30bdf62c1b62f02885e387bfa19414c50c8b39cd576f81f086b6e4a5f9e0a90"
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
