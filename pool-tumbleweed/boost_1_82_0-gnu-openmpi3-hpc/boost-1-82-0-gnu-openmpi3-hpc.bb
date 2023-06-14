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

RPM_NAME = "boost_1_82_0-gnu-openmpi3-hpc-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "e7f8629bdcfd22ab3a3ba6e39dcee660df13c501c6d57783b99615696bd3d907d39142715782f64dfd205cd9a682b3d7f5a6df3438b74b1ddd22032d1f197695"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
libc.so.6 \
libgcc-s.so.1 \
libopenmpi3-gnu-hpc \
libstdc++.so.6 \
lua-lmod \
openmpi3-gnu-hpc"

inherit rpm
