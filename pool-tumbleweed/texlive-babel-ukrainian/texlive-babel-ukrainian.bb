SUMMARY = "Babel support for Ukrainian"
DESCRIPTION = "The package provides support for use of babel in documents \
written in Ukrainian. The support is adapted for use under \
legacy TeX engines as well as XeTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4esvn56674"

RPM_NAME = "texlive-babel-ukrainian-2023.209.1.4esvn56674-54.1.noarch.rpm"
RPM_HASH = "d5afa6a28bd35cdc72af0ba5988a261c57763744475d8ab2414f7b671fea5ba27b291ecb7d3b1b0b6b12b32f3f4d4cbdd8e1852ac93d1a7f007d0255d6457f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ukraineb.ldf \
texlive-babel-ukrainian"

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
