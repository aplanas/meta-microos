SUMMARY = "Python package for the generation of PostScript, PDF, and SVG files"
DESCRIPTION = "PyX is a Python package for the creation of PostScript, PDF, and SVG files. It \
combines an abstraction of the PostScript drawing model with a TeX/LaTeX \
interface. Complex tasks like 2d and 3d plots in publication-ready quality are \
built out of these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "0.15"

RPM_NAME = "python311-PyX-0.15-2.11.noarch.rpm"
RPM_HASH = "202d7ffe762b5e662f5055e15828c1ec5deebee6635b0e394ef90b6e4067a11d3f0f27a353de50e0adabe9b61344d770509aeb25f973406bcff9fd017fcd50bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyx \
python311-PyX \
python311-pyx \
python3dist-pyx"

RDEPENDS:${PN} += "python-abi \
texlive-latex-bin-bin \
texlive-tex-bin \
texlive-texware-bin"

inherit rpm
