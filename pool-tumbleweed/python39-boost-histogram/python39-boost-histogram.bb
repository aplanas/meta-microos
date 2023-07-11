SUMMARY = "The Boost::Histogram Python wrapper"
DESCRIPTION = "Python bindings for Boost::Histogram (source), a C++14 library. This is one of \
the fastest libraries for histogramming, while still providing the power of a \
full histogram object."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python39-boost-histogram-1.3.2-1.7.aarch64.rpm"
RPM_HASH = "d27926b476d86932c2565f7b106bc16a3851df963db7ef9653aefb5ddc6fcf8394394f7e27f7d6ff9236a5155f47b04f5f256f3cf2f381b968408e98bc96b812"

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
