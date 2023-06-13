SUMMARY = "Asychronous I/O support library"
DESCRIPTION = "libuv is a support library with a focus on asynchronous I/O. It was \
primarily developed for use by Node.js, but it is also used by \
Mozilla's Rust language, Luvit, Julia, pyuv, and others."
LICENSE = "MIT"

PV = "1.44.2"

RPM_NAME = "libuv1-1.44.2-3.3.aarch64.rpm"
RPM_HASH = "11b3d803f645d1b615d97a1070be83650cd6f8f5f763504bf0b52613f1bfc4619f89dab0f6c975801b245f75f9d874578e09c3d04a8f675c28d906243ee6b0bb"

RPROVIDES:${PN} += "libuv.so.1()(64bit) \
libuv1 \
libuv1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
