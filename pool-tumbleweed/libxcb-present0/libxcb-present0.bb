SUMMARY = "X11 Present Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-present0-1.16-1.1.aarch64.rpm"
RPM_HASH = "e77b08fbd4e9959a7ae0cee52dbb49f40826d3f51c4edc2df21e51a4a89a88e35a07d9f60cc08548d6d75c8ca18bd6f93a05de12c8e2bde876c9c185ee5ba708"

RPROVIDES:${PN} += "libxcb-present.so.0 \
libxcb-present0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
