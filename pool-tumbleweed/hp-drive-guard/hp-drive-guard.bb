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

RPM_NAME = "hp-drive-guard-0.3.12-25.10.aarch64.rpm"
RPM_HASH = "5751eea5b0f0d29280fed22a50f44dc49b62868de63f917f52eef2e63126a7d70ebaf360a2caede49c04d3b0872b5bf295caa3651a2ff17657a5825f5c453f31"

RPROVIDES:${PN} += "config-hp-drive-guard \
hp-drive-guard"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpolkit-gobject-1.so.0 \
libupower-glib.so.3 \
systemd"

inherit rpm
