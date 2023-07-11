SUMMARY = "Library to access Linux Logical Volume Manager (LVM) volume containers"
DESCRIPTION = "The libvslvm library is a library to access Linux Logical Volume \
Manager (LVM) volume containers"
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm1-20221025-3.9.aarch64.rpm"
RPM_HASH = "241218644a1d2caff2159d165d9c521c0eb490799ef1311c783d34afc95c444253aff9e099970f6ccbf42a7d28f03fe03dd2647c27ded0de70a12df2f464ce29"

RPROVIDES:${PN} += "libvslvm.so.1 \
libvslvm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcsplit.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfvalue.so.1"

inherit rpm
