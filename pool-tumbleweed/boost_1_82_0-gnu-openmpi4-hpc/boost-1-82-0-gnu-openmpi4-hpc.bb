SUMMARY = "Boost C++ Libraries"
DESCRIPTION = "Boost provides free peer-reviewed portable C++ source libraries. The \
emphasis is on libraries that work well with the C++ Standard Library. \
One goal is to establish 'existing practice' and provide reference \
implementations so that the Boost libraries are suitable for eventual \
standardization. Some of the libraries have already been proposed for \
inclusion in the C++ Standards Committee's upcoming C++ Standard \
Library Technical Report. \
 \
Although Boost was begun by members of the C++ Standards Committee \
Library Working Group, membership has expanded to include nearly two \
thousand members of the C++ community at large."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi4-hpc-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "2f03ea4fc47e47639372c890c29271963e907da99c99e8370a981e25a17bbbc3144bd6fe3a1c2983e0c424b5762a4f0b2bb4ffbeeadae0b35e61a8131c5b50d1"

RPROVIDES:${PN} += "boost_1_82_0-gnu-openmpi4-hpc \
boost_1_82_0-gnu-openmpi4-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libopenmpi4-gnu-hpc \
libstdc++.so.6()(64bit) \
lua-lmod \
openmpi4-gnu-hpc"

inherit rpm
