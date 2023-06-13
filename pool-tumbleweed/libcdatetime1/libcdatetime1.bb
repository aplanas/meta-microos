SUMMARY = "Library for C date and time functions"
DESCRIPTION = "Library for C date and time functions. \
 \
libcdatetime is a low level member of the libyal library family."
LICENSE = "LGPL-3.0-or-later"

PV = "20230115"

RPM_NAME = "libcdatetime1-20230115-1.2.aarch64.rpm"
RPM_HASH = "85495e8df16719823ee4ea8b877f6e4f91babbfbe31d71a55d4cc34299e144c72d3a9149100796bf772cf638ed25728080dbd440810891a3292c861b8abc3a9d"

RPROVIDES:${PN} += "libcdatetime.so.1()(64bit) \
libcdatetime.so.1(V_20230115)(64bit) \
libcdatetime1 \
libcdatetime1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit)"

inherit rpm
