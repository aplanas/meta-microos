SUMMARY = "Cairo-rendered on-screen clock"
DESCRIPTION = "It is an analog clock displaying the system-time. It leverages the \
new visual features offered by a compositing manager to produce a \
time display with pretty-pixels."
LICENSE = "GPL-2.0"

PV = "0.3.4"

RPM_NAME = "cairo-clock-0.3.4-7.10.aarch64.rpm"
RPM_HASH = "232c9c01d32388e6b6edfeb7693b6a2268face1c95cc338ff1cbccd7ae98555cfc10548b110e116a03247fdd64a6b88eee8d4d0015386b5fa3492298388553db"

RPROVIDES:${PN} += "application() \
application(cairo-clock.desktop) \
cairo-clock \
cairo-clock(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglade-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
librsvg-2.so.2()(64bit)"

inherit rpm
