SUMMARY = "A Unicode font, with rather wide coverage"
DESCRIPTION = "The package provides a set of outline (i.e. OpenType) fonts \
covering as much as possible of the Unicode character set. The \
set consists of three typefaces: one monospaced and two \
proportional (one with uniform and one with modulated stroke)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-gnu-freefont-2023.209.svn29349-54.1.noarch.rpm"
RPM_HASH = "08857737b32c9f68b232d32ede72b9db985648f70ef9fb620d8a641a73fc56c8d27af3a8fee9a781088a14bb5e14d22c8c6df1d3d25e0d9860bf805e22067cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnu-freefont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gnu-freefont-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
