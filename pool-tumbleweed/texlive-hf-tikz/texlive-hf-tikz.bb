SUMMARY = "A simple way to highlight formulas and formula parts"
DESCRIPTION = "The package provides a way to highlight formulas and formula \
parts in both documents and presentations, us TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn34733"

RPM_NAME = "texlive-hf-tikz-2023.209.0.0.3asvn34733-54.2.noarch.rpm"
RPM_HASH = "a994ba8f5bad0e9053e4de3344348dab4bd28cc5ad398a125cb67e2bcec323983c67139f04f5a2ba180cc97062a19a0b62e8e4d8ff3d384f347e9036e73d7e6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hf-tikz.sty \
texlive-hf-tikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
