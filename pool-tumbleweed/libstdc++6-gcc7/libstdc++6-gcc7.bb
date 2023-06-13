SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libstdc++6-gcc7-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "8bdc1b4998248bede198dd87ad996684a478481f936d36c19aa74c760423cf7cea0ccc47dcbe985b9668d04a2138e07c7b6e8ef25c7a6f08d3e1580cdb452a44"

RPROVIDES:${PN} += "libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_TM_1)(64bit) \
libstdc++6 \
libstdc++6-gcc7 \
libstdc++6-gcc7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
