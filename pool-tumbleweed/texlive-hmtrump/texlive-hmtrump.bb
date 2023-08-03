SUMMARY = "Describe card games"
DESCRIPTION = "This package provides a font with LuaLaTeX support for \
describing card games."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-2023.209.1.2asvn54512-54.1.noarch.rpm"
RPM_HASH = "c7b540629f97b7cf4a0dd76db1e7a049e9a2d426d74ce460364b4269509671c920330cfdd9593a23735a0c50f424331d862fb88b368f6c3c5d690d8b99c5a418"
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
