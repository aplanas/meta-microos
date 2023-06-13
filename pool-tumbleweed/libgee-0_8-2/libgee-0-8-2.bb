SUMMARY = "GObject-based library providing commonly used data structures"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures. \
 \
This package provides Libgee's shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.6"

RPM_NAME = "libgee-0_8-2-0.20.6-1.3.aarch64.rpm"
RPM_HASH = "effbc757d67be01a73702951d0aa6b2f57003d757db3ec6adccaef99d8c20e99cab111f070b9706238031e251553bfbacbbb08c5bc5b27eca5de63a6919a0aef"

RPROVIDES:${PN} += "libgee-0.8.so.2()(64bit) \
libgee-0_8-2 \
libgee-0_8-2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
