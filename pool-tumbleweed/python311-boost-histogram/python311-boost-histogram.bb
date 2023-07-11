SUMMARY = "The Boost::Histogram Python wrapper"
DESCRIPTION = "Python bindings for Boost::Histogram (source), a C++14 library. This is one of \
the fastest libraries for histogramming, while still providing the power of a \
full histogram object."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python311-boost-histogram-1.3.2-1.7.aarch64.rpm"
RPM_HASH = "1bb5960fb450ba4067f11c24a2a3c5e0b8a90f49948070e37feb54ff4e8766ef9c57dacaf73bda4ae2d8d74621e4c00f56bdf4510daaacae09ed88b457743955"

RPROVIDES:${PN} += "python3-boost-histogram \
python3.11dist-boost-histogram \
python311-boost-histogram \
python3dist-boost-histogram"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-numpy"

inherit rpm
