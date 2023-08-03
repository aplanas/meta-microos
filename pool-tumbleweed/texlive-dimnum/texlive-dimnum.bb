SUMMARY = "Commands for dimensionless numbers"
DESCRIPTION = "This package simplifies the calling of Dimensionless Numbers in \
math or text mode."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn58774"

RPM_NAME = "texlive-dimnum-2023.209.1.0.1svn58774-53.1.noarch.rpm"
RPM_HASH = "f854d391513a48f36684373d7638af76495dc597464fba73ba1e1e6505530a07e13bf74c34ec0b04985ae2d572f7a04718e3acb22f0ad1ae0e461f16dde67680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dimnum.sty \
texlive-dimnum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
