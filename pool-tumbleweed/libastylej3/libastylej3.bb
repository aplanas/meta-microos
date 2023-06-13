SUMMARY = "Java bindings for astyle"
DESCRIPTION = "This package contains Java bindings for astyle."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "libastylej3-3.3.1-1.1.aarch64.rpm"
RPM_HASH = "9ad521779a8f3d86cb29f523d2ce35311d43e185f8f07c8a1b3d83fa7d9fd4f9f0a69d33cc01c78ec5acc7c9e54d5e8029721c6f6fbedd0240b49c572a8bd965"

RPROVIDES:${PN} += "libastylej.so.3()(64bit) \
libastylej3 \
libastylej3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
