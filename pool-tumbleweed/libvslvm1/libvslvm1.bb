SUMMARY = "Library to access Linux Logical Volume Manager (LVM) volume containers"
DESCRIPTION = "The libvslvm library is a library to access Linux Logical Volume \
Manager (LVM) volume containers"
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm1-20221025-4.1.aarch64.rpm"
RPM_HASH = "af9600c3337d7db35e672b25fdb42d1710118d260dcb3aa6a6ff4bf398336e42ff64a217a95c0b0bcb0c770eab3be40698ed06ff6cf2e82034df31cbf0910461"

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
