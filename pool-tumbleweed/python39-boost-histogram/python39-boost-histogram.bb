SUMMARY = "The Boost::Histogram Python wrapper"
DESCRIPTION = "Python bindings for Boost::Histogram (source), a C++14 library. This is one of \
the fastest libraries for histogramming, while still providing the power of a \
full histogram object."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python39-boost-histogram-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "40dcd74754061d7c6b0ba6dd0d5e6389c3a5cb95deaf9c8f4ee0d2e36542e0c3b07095f8ebf4043b9f6fc00d6fc500d126868c75d9e79eb82a06fac866e9b4d8"

RPROVIDES:${PN} += "python3.9dist-boost-histogram \
python39-boost-histogram \
python3dist-boost-histogram"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-numpy"

inherit rpm
