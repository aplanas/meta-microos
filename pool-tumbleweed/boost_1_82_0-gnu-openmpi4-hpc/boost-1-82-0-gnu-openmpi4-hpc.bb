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

RPM_NAME = "boost_1_82_0-gnu-openmpi4-hpc-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "c2bf1f4936e0269d9e9dfcb043e97d4a80eb2bdfc5c23ade7afc290d72669c5896b3cce3ac50d35d1dee28d611aca250ecdd11249aa2a77eeadebd560c05978f"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
libc.so.6 \
libgcc-s.so.1 \
libopenmpi4-gnu-hpc \
libstdc++.so.6 \
lua-lmod \
openmpi4-gnu-hpc"

inherit rpm
