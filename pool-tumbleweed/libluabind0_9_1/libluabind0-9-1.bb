SUMMARY = "Luabind Library"
DESCRIPTION = "Luabind is a library that helps you create bindings between C++ and Lua. \
It has the ability to expose functions and classes, written in C++, to Lua. \
This package contains the library."
LICENSE = "MIT"

PV = "0.9.1+git20150408.a0edf58"

RPM_NAME = "libluabind0_9_1-0.9.1+git20150408.a0edf58-2.13.aarch64.rpm"
RPM_HASH = "b6b087569dedba479808a944f598f1afb594dda350cdf028ab5648843593dd10d44a548dad8b58611f12d37a2932f93a435d35df4d24bd1ea2f17a900c4c9548"

RPROVIDES:${PN} += "libluabind.so.0.9.1()(64bit) \
libluabind0_9_1 \
libluabind0_9_1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblua5.3.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
