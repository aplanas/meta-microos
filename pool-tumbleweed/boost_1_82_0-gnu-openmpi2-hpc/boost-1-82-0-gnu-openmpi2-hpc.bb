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

RPM_NAME = "boost_1_82_0-gnu-openmpi2-hpc-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "33865d7b77b4abd7b1726d963b7676277a8ab785e88dfa24d84637c1a571127f6820175de442160e492a33a21d6bb9b9f13dc2d65f454856595f94ba3dbcc728"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
libc.so.6 \
libgcc-s.so.1 \
libopenmpi2-gnu-hpc \
libstdc++.so.6 \
lua-lmod \
openmpi2-gnu-hpc"

inherit rpm
