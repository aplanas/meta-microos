SUMMARY = "Bar program for sway"
DESCRIPTION = "Bar program for sway."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "swaybar-1.8.1-2.1.aarch64.rpm"
RPM_HASH = "f9345e4292bfbe66980170350007d8f68ef02a32263f29b802580b605ec67615cf177ed69f6a23a17a27c2bd5a6279ac99f80b66cd6c95b1d15598a7eb62322c"

RPROVIDES:${PN} += "swaybar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-c.so.5 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsystemd.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
sway"

inherit rpm
