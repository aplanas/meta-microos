SUMMARY = "Library to access Linux Logical Volume Manager (LVM) volume containers"
DESCRIPTION = "The libvslvm library is a library to access Linux Logical Volume \
Manager (LVM) volume containers"
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm1-20221025-3.7.aarch64.rpm"
RPM_HASH = "5a667e8bb7daa67f09be0a029fc052229118ef89408d0ca3a8065aa67e435f3bee6503aa742d3cb47d3366c185a0f38dbf6b0cf0b89667df245272d00844aa7d"

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
