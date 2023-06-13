SUMMARY = "Notifications Library"
DESCRIPTION = "D-BUS notifications library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "libnotify4-0.8.2-1.3.aarch64.rpm"
RPM_HASH = "17055bdb3a216c1770aaed47ba18f26b4d09f9613fb943860221c7b654b19da7842b0c83f2fdeccc4778fb01a99a7fa13712d7a7400974cafbdc5144a7b06556"

RPROVIDES:${PN} += "libnotify.so.4()(64bit) \
libnotify4 \
libnotify4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
