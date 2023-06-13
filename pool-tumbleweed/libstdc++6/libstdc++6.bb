SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libstdc++6-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "1502fdff3ddb2fe4832032f974bbe4b0b713cc36cbabb2a2293a41e8257d75403c3ac0d068fc5e67bec9f735b4ea0396253ab767f1aa806ecfa88b6a2a26fbdd"

RPROVIDES:${PN} += "libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_TM_1)(64bit) \
libstdc++6 \
libstdc++6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
