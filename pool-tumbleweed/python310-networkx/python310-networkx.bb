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

RPM_NAME = "python310-networkx-3.1-1.1.noarch.rpm"
RPM_HASH = "836781749cddb736b27e8ad1fc57daeaf24900ae74b7b51c406f625b5e34a0c36bdefdcafa6704b264767648b5abae739e067e60744afbd0db39eb43f0195a16"
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
