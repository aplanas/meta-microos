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

RPM_NAME = "python311-networkx-2.8.8-1.3.noarch.rpm"
RPM_HASH = "e27605e4f7c79de879ccb09c8e90a8fc74da466121314524bf6bf3d7094ea998f05784c2d9b43a2ca827e44d1bfa4104ab2ff47220be89a035e1816a046cacbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(networkx) \
python311-networkx \
python3dist(networkx)"

RDEPENDS:${PN} += "python(abi) \
python311-matplotlib \
python311-numpy \
python311-pandas \
python311-scipy"

inherit rpm
