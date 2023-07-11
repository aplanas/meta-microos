SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "12.3.0+git1204"

RPM_NAME = "libgphobos3-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "b752cc7e8f53317b7b51a5c54053358922e73b12931a53b028becb40367db09e967b34bee86cb6eba06bb2f7125a8042ce4f21b3ef5bbf6c34cef4efab3bdf55"

RPROVIDES:${PN} += "libgphobos.so.3 \
libgphobos3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
