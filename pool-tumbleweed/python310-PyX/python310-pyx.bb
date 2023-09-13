SUMMARY = "Python package for the generation of PostScript, PDF, and SVG files"
DESCRIPTION = "PyX is a Python package for the creation of PostScript, PDF, and SVG files. It \
combines an abstraction of the PostScript drawing model with a TeX/LaTeX \
interface. Complex tasks like 2d and 3d plots in publication-ready quality are \
built out of these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "0.16"

RPM_NAME = "python310-PyX-0.16-1.1.noarch.rpm"
RPM_HASH = "481a4fdc0918b95dd5dbdaf17f164a9605dc481952c8b72e0bf3f6e82d0591e2b411901695451460fdbdc1cf8831c52463a7f152eb2b6975e4365f39b20e8b49"
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
