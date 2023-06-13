SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libgdruntime4-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "0981bf490ae812edc030358f310206a60ec0ee283af96a1063068a886725311418478ee25392e82232870d4f2d74e5e7cff55468973220878b7d1c5153193eea"

RPROVIDES:${PN} += "libgdruntime.so.4()(64bit) \
libgdruntime4 \
libgdruntime4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
