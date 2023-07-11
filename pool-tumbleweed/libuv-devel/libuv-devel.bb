SUMMARY = "Development libraries for libuv"
DESCRIPTION = "Development files for libuv. \
 \
libuv is a support library with a focus on asynchronous I/O. It was \
primarily developed for use by Node.js, but it is also used by \
Mozilla's Rust language, Luvit, Julia, pyuv, and others."
LICENSE = "MIT"

PV = "1.44.2"

RPM_NAME = "libuv-devel-1.44.2-3.4.aarch64.rpm"
RPM_HASH = "83d7bb224eb57ce2c550d30f31fadef029a232ffbc975dc0e9424b61f923aacaeafa7df93fc2c67a10a418ff5352ab2d68b33901f2b949649bf84955e4acc9a7"

RPROVIDES:${PN} += "libuv-devel \
pkgconfig-libuv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuv1"

inherit rpm
