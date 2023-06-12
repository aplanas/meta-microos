SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "libubsan1-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "7c000a426df276983ba2627b75b01aaa643820a2c24a90e9fe164d773182e8e4ac61fec2bb1765fecf42720059b7cdbc42cfccb83ab204a9b535a97a7cd952e3"

RPROVIDES:${PN} += "libubsan.so.1()(64bit) \
libubsan1 \
libubsan1-gcc12 \
libubsan1-gcc12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
