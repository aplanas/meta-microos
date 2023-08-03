SUMMARY = "A simple way to highlight formulas and formula parts"
DESCRIPTION = "The package provides a way to highlight formulas and formula \
parts in both documents and presentations, us TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn34733"

RPM_NAME = "texlive-hf-tikz-2023.209.0.0.3asvn34733-54.1.noarch.rpm"
RPM_HASH = "a5087f2482fbbc6bef535352adefd9a5fd4d0494391e95b7de0f417b0c18fa76ca3077ab5c3df8730bb5a9e314528e0511463c13a24daef425c4791df82f14aa"
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
