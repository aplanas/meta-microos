SUMMARY = "The Boost::Histogram Python wrapper"
DESCRIPTION = "Python bindings for Boost::Histogram (source), a C++14 library. This is one of \
the fastest libraries for histogramming, while still providing the power of a \
full histogram object."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python310-boost-histogram-1.3.2-1.7.aarch64.rpm"
RPM_HASH = "1f562011bdd4e1faab3692a6cbf6e3b651d169652a2cc384decceec8f118496aa05ee5b63930b845a997e38b389159931701f1cd2091f0ee8f4bd3e10461a11b"

RPROVIDES:${PN} += "python3.10dist-boost-histogram \
python310-boost-histogram \
python3dist-boost-histogram"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-numpy"

inherit rpm
