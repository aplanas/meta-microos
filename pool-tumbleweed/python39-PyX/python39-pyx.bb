SUMMARY = "Python package for the generation of PostScript, PDF, and SVG files"
DESCRIPTION = "PyX is a Python package for the creation of PostScript, PDF, and SVG files. It \
combines an abstraction of the PostScript drawing model with a TeX/LaTeX \
interface. Complex tasks like 2d and 3d plots in publication-ready quality are \
built out of these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "0.16"

RPM_NAME = "python39-PyX-0.16-1.1.noarch.rpm"
RPM_HASH = "71f0edd6b247a8be235602ba25ecb0855ff1e52e256d750c1535de1152c2a1ce59f354980d15a61608c8114164dea9b8ca386910bea7cf130997b0d4dd5da655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyx \
python39-PyX \
python39-pyx \
python3dist-pyx"

RDEPENDS:${PN} += "python-abi \
texlive-latex-bin-bin \
texlive-tex-bin \
texlive-texware-bin"

inherit rpm
