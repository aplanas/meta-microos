SUMMARY = "Asychronous I/O support library"
DESCRIPTION = "libuv is a support library with a focus on asynchronous I/O. It was \
primarily developed for use by Node.js, but it is also used by \
Mozilla's Rust language, Luvit, Julia, pyuv, and others."
LICENSE = "MIT"

PV = "1.44.2"

RPM_NAME = "libuv1-1.44.2-3.4.aarch64.rpm"
RPM_HASH = "2310df35af36323826122192f9c2bca3b6a6e36559eb1f92ac8c97abebfd76bdc97dbde2d6ed18ef473164d92c99a0b3f0cdb1e56a00a56de414eb7e9a60561a"

RPROVIDES:${PN} += "libuv.so.1 \
libuv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
