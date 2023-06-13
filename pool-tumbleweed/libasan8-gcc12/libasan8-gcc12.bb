SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "libasan8-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "ad7f6f2f7446e76eb2df59b74994d40e4c3282b9091542a36c85f1a2a1016640f1bd790688384a8621b75534484281ca7ab829fe8122f2adc4ce0d7ec404bca6"

RPROVIDES:${PN} += "libasan.so.8()(64bit) \
libasan8 \
libasan8-gcc12 \
libasan8-gcc12(aarch-64)"

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
