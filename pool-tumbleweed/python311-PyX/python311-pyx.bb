SUMMARY = "Python package for the generation of PostScript, PDF, and SVG files"
DESCRIPTION = "PyX is a Python package for the creation of PostScript, PDF, and SVG files. It \
combines an abstraction of the PostScript drawing model with a TeX/LaTeX \
interface. Complex tasks like 2d and 3d plots in publication-ready quality are \
built out of these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "0.15"

RPM_NAME = "python311-PyX-0.15-2.13.noarch.rpm"
RPM_HASH = "1f28966581a1ee3863cdcbe59afe4d8f746bc7f9e09f058a3e967f7d750f5fac6a335ba3f3934fe8620b4dcadb86284cf03714c77bb3292e5577ad67947d0cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyX \
python3-pyx \
python3.11dist-pyx \
python311-PyX \
python311-pyx \
python3dist-pyx"

RDEPENDS:${PN} += "python-abi \
texlive-latex-bin-bin \
texlive-tex-bin \
texlive-texware-bin"

inherit rpm
