SUMMARY = "Describe card games"
DESCRIPTION = "This package provides a font with LuaLaTeX support for \
describing card games."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-2023.201.1.2asvn54512-53.2.noarch.rpm"
RPM_HASH = "96f4092185432661dcded6fb8d00c1c00a2ff8fcaf284d3244f431734c702b032b0ba4cbc58ef08ac8d29815c87e8839107d4a2fcd3d8adcbeac87a5b924c858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hmtrump.sty \
texlive-hmtrump"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-hmtrump-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
