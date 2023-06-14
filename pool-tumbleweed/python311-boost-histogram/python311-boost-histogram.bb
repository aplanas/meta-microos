SUMMARY = "The Boost::Histogram Python wrapper"
DESCRIPTION = "Python bindings for Boost::Histogram (source), a C++14 library. This is one of \
the fastest libraries for histogramming, while still providing the power of a \
full histogram object."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python311-boost-histogram-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "fa1ce96bc76b61dac50dc905e17f9f6de996f9f31db667595cbd9fb0e5aa32abef55d0190a5fb8b2b2fab2e71e6e9e24f9ee9e2ba310094e564d53f5fa4361ae"

RPROVIDES:${PN} += "python3.11dist-boost-histogram \
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
