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

RPM_NAME = "python39-networkx-2.8.8-1.3.noarch.rpm"
RPM_HASH = "9b1f83cafaf7b2184c43cc30cd106cd30b12d0d4ce8a1608ebe67f1e841cff83982bbed82e09a8d993732d08969388f0589d25430fbb576f19937c00215633ea"
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
