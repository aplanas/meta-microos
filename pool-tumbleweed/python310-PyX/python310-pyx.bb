SUMMARY = "Python package for the generation of PostScript, PDF, and SVG files"
DESCRIPTION = "PyX is a Python package for the creation of PostScript, PDF, and SVG files. It \
combines an abstraction of the PostScript drawing model with a TeX/LaTeX \
interface. Complex tasks like 2d and 3d plots in publication-ready quality are \
built out of these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "0.15"

RPM_NAME = "python310-PyX-0.15-2.11.noarch.rpm"
RPM_HASH = "134d3d0c8323d836f2cb4ddb95d464897f47c57e4d8c62a0cf5a99585985b73534ea04130e5b21a2c8a19a7148e115f2433a91b31b5816de8a0682373c6594f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyX \
python3-pyx \
python3.10dist(pyx) \
python310-PyX \
python310-pyx \
python3dist(pyx)"

RDEPENDS:${PN} += "python(abi) \
texlive-latex-bin-bin \
texlive-tex-bin \
texlive-texware-bin"

inherit rpm
