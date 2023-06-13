SUMMARY = "Babel support for Ukrainian"
DESCRIPTION = "The package provides support for use of babel in documents \
written in Ukrainian. The support is adapted for use under \
legacy TeX engines as well as XeTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4esvn56674"

RPM_NAME = "texlive-babel-ukrainian-2023.201.1.4esvn56674-53.1.noarch.rpm"
RPM_HASH = "e66a114f8ce10d85a5e7aed4416cf69f9c408e826842b16ec9819d0d0ec530bf78ad66608978b6e6f2a1ee82a793736a60516a7845507723f512ac41230d3949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ukraineb.ldf) \
texlive-babel-ukrainian"

RDEPENDS:${PN} += "/bin/sh \
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
