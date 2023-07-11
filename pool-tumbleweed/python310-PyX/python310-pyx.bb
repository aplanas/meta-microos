SUMMARY = "Python package for the generation of PostScript, PDF, and SVG files"
DESCRIPTION = "PyX is a Python package for the creation of PostScript, PDF, and SVG files. It \
combines an abstraction of the PostScript drawing model with a TeX/LaTeX \
interface. Complex tasks like 2d and 3d plots in publication-ready quality are \
built out of these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "0.15"

RPM_NAME = "python310-PyX-0.15-2.13.noarch.rpm"
RPM_HASH = "7476f20b988bf44262a12e141b47d3ab718fac6cc8af6b578addfb34cec29b7d15872cf8b137325f0b90f6d1b4f35d27f0323b3487e20b72cc1f20dc2f231a11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyx \
python310-PyX \
python310-pyx \
python3dist-pyx"

RDEPENDS:${PN} += "python-abi \
texlive-latex-bin-bin \
texlive-tex-bin \
texlive-texware-bin"

inherit rpm
