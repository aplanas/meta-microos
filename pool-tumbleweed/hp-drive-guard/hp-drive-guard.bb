SUMMARY = "HP DriveGuard for SUSE"
DESCRIPTION = "HP DriveGuard for SUSE. Can protect hard disks on HP laptops by \
spinning them down when shaking or free-fall is detected. \
 \
 \
 \
Authors: \
-------- \
    Hans Petter Jansson <hpj@suse.com>"
LICENSE = "GPL-2.0+"

PV = "0.3.12"

RPM_NAME = "hp-drive-guard-0.3.12-25.9.aarch64.rpm"
RPM_HASH = "49427681c868f7ee79397279e2ad59d99ff2e81e0e4ca656fca78ac7572c3ccfa55e2c3d5766d6584b19e9d31184a6ce75684b9bdde54d1899636719ffc7fb05"

RPROVIDES:${PN} += "config(hp-drive-guard) \
hp-drive-guard \
hp-drive-guard(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libupower-glib.so.3()(64bit) \
systemd"

inherit rpm
