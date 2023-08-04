SUMMARY = "Asychronous I/O support library"
DESCRIPTION = "libuv is a support library with a focus on asynchronous I/O. It was \
primarily developed for use by Node.js, but it is also used by \
Mozilla's Rust language, Luvit, Julia, pyuv, and others."
LICENSE = "MIT"

PV = "1.46.0"

RPM_NAME = "libuv1-1.46.0-1.1.aarch64.rpm"
RPM_HASH = "3932e810b8005370e35961abee6255082cfb7ba95a6819f86d5d45eae73c6546abce82bb26e8eefe99e1b6a18e3f76ef1f48d24e2d2668a60b5691a3ef0aa613"

RPROVIDES:${PN} += "libuv.so.1 \
libuv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
