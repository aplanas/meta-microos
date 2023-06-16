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

PV = "2023.201.svn41264"

RPM_NAME = "texlive-tex-gyre-math-2023.201.svn41264-54.1.noarch.rpm"
RPM_HASH = "892d2be1913d44a28cd56a96f8fc92e33bc4cd8083a88b2f783dab421f8eaf5c14f1ab05043727fea56a12f50599b286dbe07bd8fe6f64c40019caa5d4bf161e"
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
