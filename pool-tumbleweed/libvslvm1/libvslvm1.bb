SUMMARY = "Library to access Linux Logical Volume Manager (LVM) volume containers"
DESCRIPTION = "The libvslvm library is a library to access Linux Logical Volume \
Manager (LVM) volume containers"
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm1-20221025-5.1.aarch64.rpm"
RPM_HASH = "83d07290e17be9e8280c9b38704c0579868d3edc54a7f73514f342cf383f64c38995bf86c2e2680bbb70331c815ba1ab279150d827ce685d966cfdfc45a27b13"

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
