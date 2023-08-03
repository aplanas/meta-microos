SUMMARY = "Fira sans serif font with Unicode math support"
DESCRIPTION = "Fira Math is a sans-serif font with Unicode math support. The \
design of this font is based on Fira Sans and FiraGO. Fira Math \
is distributed in OpenType format and can be used with the \
unicode-math package under XeLaTeX or LuaLaTeX. More support is \
offered by the firamath-otf package."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.3.4svn56672"

RPM_NAME = "texlive-firamath-2023.209.0.0.3.4svn56672-53.1.noarch.rpm"
RPM_HASH = "59f803a6f94e0602e41980d1771e28c1ddc8b5da6a2ee0f1487f5c81b8b5ded36cb79efec19a2c358dfe1442ac4f9739b2caf99729d862cb1cd94274b23486c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-firamath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-firamath-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
