SUMMARY = "A simple way to highlight formulas and formula parts"
DESCRIPTION = "The package provides a way to highlight formulas and formula \
parts in both documents and presentations, us TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn34733"

RPM_NAME = "texlive-hf-tikz-2023.201.0.0.3asvn34733-53.1.noarch.rpm"
RPM_HASH = "46b6b637e4f08f6a8f1ffb34e1beff738b8201e93f77cca924be5046a3f7857ae99239ddc158eb5c0e0dae310026da26dfae1fcad0aaaf29a3be33cb47fd44ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hf-tikz.sty) \
texlive-hf-tikz"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(tikz.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
