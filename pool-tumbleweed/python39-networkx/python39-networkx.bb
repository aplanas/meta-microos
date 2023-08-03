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

PV = "3.1"

RPM_NAME = "python39-networkx-3.1-1.1.noarch.rpm"
RPM_HASH = "89fa99251728415fb8feabb3b867ded52e6edeb5553cea09b4fb76efb0cf11f597ef599e590dba6670f1b75762cb767d90bcdfb3a8aa2f836e730b77a5675f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-networkx \
python39-networkx \
python3dist-networkx"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-numpy \
python39-pandas \
python39-scipy"

inherit rpm
