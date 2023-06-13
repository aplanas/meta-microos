SUMMARY = "Linux-Native Asynchronous I/O Access Library"
DESCRIPTION = "The Linux-native asynchronous I/O facility ('async I/O', or 'aio') has \
a richer API and capability set than the simple POSIX async I/O \
facility. This library provides the Linux-native API for async I/O. The \
POSIX async I/O facility requires this library to provide \
kernel-accelerated async I/O capabilities, as do applications that \
require the Linux-native async I/O API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.113"

RPM_NAME = "libaio1-0.3.113-3.1.aarch64.rpm"
RPM_HASH = "bd897346140137aee1d99550e3cb141dfe5d467f3318225a765ef002efd54a0ad88d9a32ef8d13cb1eb995e754a57dedfb8493e5cf753018649f6e5d9cc3570b"

RPROVIDES:${PN} += "libaio \
libaio.so.1()(64bit) \
libaio.so.1(LIBAIO_0.1)(64bit) \
libaio.so.1(LIBAIO_0.4)(64bit) \
libaio.so.1(LIBAIO_0.5)(64bit) \
libaio1 \
libaio1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
