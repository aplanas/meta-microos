SUMMARY = "Sndfile plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the Sndfile plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-sndfile-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "17ed483b286c6459321f92937bcd0422f651af4e8af076d3b6a8a03e80e006096b9eb3fdaeea45d2654033506c1ef8f9168aebeb22167e52a2941e813a286b90"

RPROVIDES:${PN} += "audaspace-fileplugin audaspace-plugin-sndfile audaspace-plugin-sndfile(aarch-64) libaudlibsndfile.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaudaspace.so.1.4()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
