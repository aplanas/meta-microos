SUMMARY = "Cairo-rendered on-screen clock"
DESCRIPTION = "It is an analog clock displaying the system-time. It leverages the \
new visual features offered by a compositing manager to produce a \
time display with pretty-pixels."
LICENSE = "GPL-2.0"

PV = "0.3.4"

RPM_NAME = "cairo-clock-0.3.4-7.10.aarch64.rpm"
RPM_HASH = "232c9c01d32388e6b6edfeb7693b6a2268face1c95cc338ff1cbccd7ae98555cfc10548b110e116a03247fdd64a6b88eee8d4d0015386b5fa3492298388553db"

RPROVIDES:${PN} += "cairo-clock"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglade-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
librsvg-2.so.2"

inherit rpm
