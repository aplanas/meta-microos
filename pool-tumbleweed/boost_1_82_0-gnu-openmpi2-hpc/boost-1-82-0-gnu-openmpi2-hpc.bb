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

RPM_NAME = "boost_1_82_0-gnu-openmpi2-hpc-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "c6d747f61ba3602aabb6f7c4acbb06ad74cf0896f1afa1b63de32148dbde77ad52eef647a24df476975220eb74ac57d1c3bd90b1997fdc645f58da7f8e41b427"

RPROVIDES:${PN} += "boost_1_82_0-gnu-openmpi2-hpc \
boost_1_82_0-gnu-openmpi2-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libopenmpi2-gnu-hpc \
libstdc++.so.6()(64bit) \
lua-lmod \
openmpi2-gnu-hpc"

inherit rpm
