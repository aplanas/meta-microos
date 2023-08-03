SUMMARY = "Maths fonts to match tex-gyre text fonts"
DESCRIPTION = "TeX-Gyre-Math is a collection of maths fonts to match the text \
fonts of the TeX-Gyre collection. The collection is available \
in OpenType format, only; fonts conform to the developing \
standards for OpenType maths fonts. TeX-Gyre-Math-Bonum (to \
match TeX-Gyre-Bonum), TeX-Gyre-Math-Pagella (to match \
TeX-Gyre-Pagella), TeX-Gyre-Math-Schola (to match \
TeX-Gyre-Schola) and TeX-Gyre-Math-Termes (to match \
TeX-Gyre-Termes) fonts are provided."
LICENSE = "LPPL-1.3c"

PV = "2023.209.svn41264"

RPM_NAME = "texlive-tex-gyre-math-2023.209.svn41264-55.1.noarch.rpm"
RPM_HASH = "8af18993d3a0a4ea9c6e3086bb9d9c54362a70cc1f712684e5a66dc3b77cd92c2ec9621994f8c03f19ab3140b6fe22df5449cde5444a8c0d622cf334c379f6a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-gyre-math"

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
texlive-scripts-bin \
texlive-tex-gyre-math-fonts"

inherit rpm
