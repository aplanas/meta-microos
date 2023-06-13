SUMMARY = "The Boost::Histogram Python wrapper"
DESCRIPTION = "Python bindings for Boost::Histogram (source), a C++14 library. This is one of \
the fastest libraries for histogramming, while still providing the power of a \
full histogram object."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python310-boost-histogram-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "d56a2f5a7c528e555a488dc152a2b7c857744d9eaa363e97d0badcf3231c59c18d09a10e479b3a7ffef88d0b0f08cf0f5db1303b1cf612e24cd4eb17cf8c018a"

RPROVIDES:${PN} += "python3-boost-histogram \
python3.10dist(boost-histogram) \
python310-boost-histogram \
python310-boost-histogram(aarch-64) \
python3dist(boost-histogram)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-numpy"

inherit rpm
