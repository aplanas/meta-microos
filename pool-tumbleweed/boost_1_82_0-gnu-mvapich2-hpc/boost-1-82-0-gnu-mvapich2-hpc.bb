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

RPM_NAME = "boost_1_82_0-gnu-mvapich2-hpc-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "09878af415025c5ef136583b6c8120f4206e0acfd6c801ebddf5978191c7a58a947e74fd4801bdac5f14d5cdec1f8d42d5014b783d301d6687100746e1e90d0c"

RPROVIDES:${PN} += "boost-1-82-0-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
