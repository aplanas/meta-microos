SUMMARY = "System Daemon for Managing Color Devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "colord-1.4.6-3.1.aarch64.rpm"
RPM_HASH = "0d5aa6240c0fce3e94bcc85dc464784f4ef284234ad071e6ddafb3257f41931f0468f2c05e3665a6baf6f8121bb5b8360f64802f93730e01fa9b4c5c5db934f5"

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
