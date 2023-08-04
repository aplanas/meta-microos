SUMMARY = "Development libraries for libuv"
DESCRIPTION = "Development files for libuv. \
 \
libuv is a support library with a focus on asynchronous I/O. It was \
primarily developed for use by Node.js, but it is also used by \
Mozilla's Rust language, Luvit, Julia, pyuv, and others."
LICENSE = "MIT"

PV = "1.46.0"

RPM_NAME = "libuv-devel-1.46.0-1.1.aarch64.rpm"
RPM_HASH = "e68acd797ed1756f93960c547e8d5720ee0de5acd147333a658036d1fd191bcafea3aa3009002438fe1038b0db82d708226bdab6a4bb7c045a0ebd019afba4d2"

RPROVIDES:${PN} += "libuv-devel \
pkgconfig-libuv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuv1"

inherit rpm
