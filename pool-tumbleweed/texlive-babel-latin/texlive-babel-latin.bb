SUMMARY = "Babel support for Latin"
DESCRIPTION = "The babel-latin package provides the babel languages latin, \
classiclatin, medievallatin, and ecclesiasticlatin. It also \
defines several useful shorthands as well as some modifiers for \
typographical fine-tuning."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0svn59800"

RPM_NAME = "texlive-babel-latin-2023.201.4.0svn59800-53.1.noarch.rpm"
RPM_HASH = "de16a2859f729737c2d734e2e9af2e820e84d801ff0ead7eadd59de400e2a430803ff114501e5be41778f2c8f19c8eb89aa327386cdff3b9ae5087d2cf8f1af1"
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
