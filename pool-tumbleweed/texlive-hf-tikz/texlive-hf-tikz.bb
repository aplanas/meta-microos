SUMMARY = "A simple way to highlight formulas and formula parts"
DESCRIPTION = "The package provides a way to highlight formulas and formula \
parts in both documents and presentations, us TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn34733"

RPM_NAME = "texlive-hf-tikz-2023.201.0.0.3asvn34733-53.2.noarch.rpm"
RPM_HASH = "e2c44b06d043ed1c695d2c6a1e31fe3e1191637bf7fa529414a8b0e949578a2179bd7d3b63157f5e7e23c7f7f46890ad72908afeafe80ea4dfa9719e44820353"
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
