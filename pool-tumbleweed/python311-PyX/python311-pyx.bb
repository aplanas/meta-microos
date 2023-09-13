SUMMARY = "Python package for the generation of PostScript, PDF, and SVG files"
DESCRIPTION = "PyX is a Python package for the creation of PostScript, PDF, and SVG files. It \
combines an abstraction of the PostScript drawing model with a TeX/LaTeX \
interface. Complex tasks like 2d and 3d plots in publication-ready quality are \
built out of these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "0.16"

RPM_NAME = "python311-PyX-0.16-1.1.noarch.rpm"
RPM_HASH = "4e601511a65ec0139c2fc192094f1c4b8cc73aaf4027ab6dabf8891c128144759b7cbf24173fd4db2fd52396d1f17fb17eb276ae53f71fb169cec1e8451c1db0"
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
