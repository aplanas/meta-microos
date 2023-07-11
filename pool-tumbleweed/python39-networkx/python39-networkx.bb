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

RPM_NAME = "python39-networkx-2.8.8-2.1.noarch.rpm"
RPM_HASH = "d3849ba1c913a81ebb8bf7d8b8693ee81dede74b10bcf800b3ad27600c6b4bd21828429a58849b06c7a6882e44abebc0c3f233f3a5aa12663352551db881b182"
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
