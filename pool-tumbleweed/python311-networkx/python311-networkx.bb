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

RPM_NAME = "python311-networkx-3.1-1.1.noarch.rpm"
RPM_HASH = "3f04a754261d7e3652350522c97c46451a2091162b722f56af38f3d32a3821123704813edbea8672da72af6841b75e1bb88093f91cfbdc2df0219b94d4775ea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-networkx \
python3.11dist-networkx \
python311-networkx \
python3dist-networkx"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-numpy \
python311-pandas \
python311-scipy"

inherit rpm
