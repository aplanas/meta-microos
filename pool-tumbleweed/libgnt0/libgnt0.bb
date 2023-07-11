SUMMARY = "TUI Toolkit based on GLib and ncurses"
DESCRIPTION = "GNT is an ncurses toolkit for creating text-mode graphical user \
interfaces."
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "libgnt0-2.14.3-1.8.aarch64.rpm"
RPM_HASH = "36bc232f73f5af4086f2285d6214689ac620bb90c8d57a832cac1c40f17375d38b3669b4baacaceaefd35f9f3d8eef8ec86b613c0ab808e69d8ea77c619b3dda"

RPROVIDES:${PN} += "libgnt.so.0 \
libgnt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
libxml2.so.2"

inherit rpm
