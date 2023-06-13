SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "12.3.0+git1204"

RPM_NAME = "libgphobos3-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "38f31883a7678860fcab3b36298e113286a30f35d21a92f2f10d9cfa339dfeaccb723787959f0429b7f0b9d4fc3a28d8873dd454fdaf252097234b47ebc96527"

RPROVIDES:${PN} += "libgphobos.so.3()(64bit) \
libgphobos3 \
libgphobos3(aarch-64)"

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
