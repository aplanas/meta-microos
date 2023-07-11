SUMMARY = "System Daemon for Managing Color Devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "colord-1.4.6-2.4.aarch64.rpm"
RPM_HASH = "ba773ee238c9665c3d1c7051df47a14ccbeb26b831007865441204c0a12260f2a3ba2a5925cbfe99472b95ef156ad723fb13025ec0b9a897e14b24c7429ff28c"

RPROVIDES:${PN} += "colord \
config-colord \
group-colord \
libcolord-sensor-argyll.so \
libcolord-sensor-camera.so \
libcolord-sensor-colorhug.so \
libcolord-sensor-dtp94.so \
libcolord-sensor-dummy.so \
libcolord-sensor-huey.so \
libcolord-sensor-scanner.so \
libcolordcompat.so \
user-colord"

RDEPENDS:${PN} += "/usr/bin/sh \
argyllcms \
colord-color-profiles \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcolord.so.2 \
libcolordprivate.so.2 \
libcolorhug.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libgusb.so.2 \
liblcms2.so.2 \
libm.so.6 \
libpolkit-gobject-1.so.0 \
libsqlite3.so.0 \
libsystemd.so.0 \
systemd \
sysuser-shadow"

inherit rpm
