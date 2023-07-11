SUMMARY = "Python package for the generation of PostScript, PDF, and SVG files"
DESCRIPTION = "PyX is a Python package for the creation of PostScript, PDF, and SVG files. It \
combines an abstraction of the PostScript drawing model with a TeX/LaTeX \
interface. Complex tasks like 2d and 3d plots in publication-ready quality are \
built out of these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "0.15"

RPM_NAME = "python39-PyX-0.15-2.13.noarch.rpm"
RPM_HASH = "20b374c4c5ebc623299f50754beb7a00d0aeae91c0466d05d5ae19673dfc2667ec904cb3c86d297414160b1e94f78a09a01d59e27a1c9ac3fe2fdc902740a3b4"
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
