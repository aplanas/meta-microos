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

RPM_NAME = "python311-networkx-2.8.8-2.1.noarch.rpm"
RPM_HASH = "cb6b03d22d8f8ade3a80e187d4dd0af82b8865640dc895638c4cc347b1f8da7fd67a1933ff4cef175ca141be0459138fabd8289d8a79ce25b00e5a882ad21d3c"
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
