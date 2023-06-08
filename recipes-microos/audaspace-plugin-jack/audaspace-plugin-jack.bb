SUMMARY = "JACK plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the JACK plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-jack-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "4db5cd2bba7e52ec0a5996d9fb1ad72cc39ed439d9f2fcb8f9212edbaecd8be7ef36d268ed24f03955fd873d87ba0ff001833e66ebd476edf2d256259c05e261"

RPROVIDES:${PN} += "audaspace-deviceplugin audaspace-plugin-jack audaspace-plugin-jack(aarch-64) libaudjack.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaudaspace.so.1.4()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjack.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit)"

inherit rpm
