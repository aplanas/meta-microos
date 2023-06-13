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

RPM_NAME = "boost_1_82_0-gnu-hpc-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "d1f8b53b846f951687c6a03847003e2bdeaf67b8961ee385fa8349bd87b084d4e9df591dd76f04470bfe287e39b2524a6640dfbfc8132b696a54128b1c516265"

RPROVIDES:${PN} += "boost_1_82_0-gnu-hpc \
boost_1_82_0-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
lua-lmod"

inherit rpm
