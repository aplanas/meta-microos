SUMMARY = "Additional error protection for CD/DVD media"
DESCRIPTION = "dvdisaster provides a margin of safety against data loss on CD and DVD media \
caused by scratches or aging. It creates error correction data, \
which is used to recover unreadable sectors if the disc becomes damaged \
at a later time."
LICENSE = "GPL-3.0-or-later"

PV = "0.79.10"

RPM_NAME = "dvdisaster-0.79.10-1.1.aarch64.rpm"
RPM_HASH = "b85e4543cc5e2938998ab96bbc0a143a8e22a85dc666962c21a75313e78224a0cada72588d7112217df20ea9181a92f07cb5e308615bf514eb2d091edffa57b2"

RPROVIDES:${PN} += "dvdisaster"

RDEPENDS:${PN} += "dvdisaster-docs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
