SUMMARY = "Babel support for Latin"
DESCRIPTION = "The babel-latin package provides the babel languages latin, \
classiclatin, medievallatin, and ecclesiasticlatin. It also \
defines several useful shorthands as well as some modifiers for \
typographical fine-tuning."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0svn59800"

RPM_NAME = "texlive-babel-latin-2023.209.4.0svn59800-54.1.noarch.rpm"
RPM_HASH = "962ebc4c7e33040a97a67e7549c62e02473f5bc3d7bd754a162b79e2381ac7a9725f533ea24036daf3e60f07829b8aae8d9cf3c2d284bc7cc00873ff0f314228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-classiclatin.ldf \
tex-ecclesiasticlatin.ldf \
tex-latin.ldf \
tex-medievallatin.ldf \
texlive-babel-latin"

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
