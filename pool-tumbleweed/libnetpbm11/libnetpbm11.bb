SUMMARY = "Libraries for the NetPBM (NetPortableBitmap) Graphic Formats"
DESCRIPTION = "These are the libs for the netpbm graphic formats. The tools can be \
found in the netpbm package. The sources are contained in the netpbm \
source package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & IJG & MIT & SUSE-Public-Domain"

PV = "10.96.4"

RPM_NAME = "libnetpbm11-10.96.4-5.3.aarch64.rpm"
RPM_HASH = "f12bc90fe83a52816c0a3473153c1853dabc9f7778be708262c501e9ffc74d9033e87a14023935e5504aaf44b7d88d24541e8fc10beea42c06d8feefe8ec9d70"

RPROVIDES:${PN} += "libnetpbm \
libnetpbm.so.11()(64bit) \
libnetpbm11 \
libnetpbm11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
