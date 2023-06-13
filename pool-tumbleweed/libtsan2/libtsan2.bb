SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "libtsan2-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "733929df1cdefbdc2ff9deddc8c1849c101e37c27db7b1ad3f21e29f8c28033e220b36d98bbbc9f1bc0e10f252564fd75d9bc8048d364859ffb18e96fe0a86ac"

RPROVIDES:${PN} += "libtsan.so.2()(64bit) \
libtsan2 \
libtsan2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
