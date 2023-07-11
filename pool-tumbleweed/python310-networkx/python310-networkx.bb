SUMMARY = "Python package for the study of complex networks"
DESCRIPTION = "NetworkX (NX) is a Python package for the creation, manipulation, and study of the structure, dynamics, \
and functions of complex networks. \
 \
Features: \
 * Includes standard graph-theoretic and statistical physics functions \
 * Exchange of network algorithms between applications, disciplines, and platforms \
 * Includes many classic graphs and synthetic networks \
 * Nodes and edges can be 'anything' (e.g. time-series, text, images, XML records) \
 * Exploits existing code from high-quality legacy software in C, C++, Fortran, etc. \
 * Unit-tested"
LICENSE = "BSD-3-Clause"

PV = "2.8.8"

RPM_NAME = "python310-networkx-2.8.8-2.1.noarch.rpm"
RPM_HASH = "1c1e65f8dba769c4094317e7cbce74390b602d528448b9f0a20ac61bd7d45e16abc958217ca81acfc0d8c6b184ace202a15bf926ca737877709faeb4a5537cb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-networkx \
python310-networkx \
python3dist-networkx"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy \
python310-pandas \
python310-scipy"

inherit rpm
