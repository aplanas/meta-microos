SUMMARY = "Simple Notification Daemon for Xfce"
DESCRIPTION = "Xfce4-notifyd is a simple, visually-appealing notification daemon for Xfce that \
implements the Freedesktop.org Desktop Notifications Specification."
LICENSE = "GPL-2.0-only"

PV = "0.8.2"

RPM_NAME = "xfce4-notifyd-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "48492adb1214f564af18ca85978c5b15df457bf47b13d3cf8cda287c7eff0aa592844ffe2ebfc0b2f41e4068871761d00253231336b05a561f3a73b91e33f2ba"

RPROVIDES:${PN} += "libnotification-plugin.so \
notification-daemon-xfce \
xfce4-notifyd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify-tools \
libnotify.so.4 \
libsqlite3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-notifyd-branding"

inherit rpm
