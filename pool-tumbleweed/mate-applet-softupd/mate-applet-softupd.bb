SUMMARY = "MATE panel applet for software update notifications"
DESCRIPTION = "This is a MATE panel applet to notify when software updates are \
available. \
 \
The notification is displayed in two ways: \
  1) by changing the icon of the applet. \
  2) by sending a notification to the notification-daemon. \
 \
The information is obtained from PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.8"

RPM_NAME = "mate-applet-softupd-0.4.8-1.9.aarch64.rpm"
RPM_HASH = "94e02c320bf95f62bfa7149ed2c87b114c79c09b8a8217780e90e76afef64dd5b44d1c4de4c308138a3e7373efe3c1a6eb8fa336568486260c9b503f7fd9a81c"

RPROVIDES:${PN} += "mate-applet-softupd"

RDEPENDS:${PN} += "PackageKit \
gnome-packagekit \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-panel-applet-4.so.1 \
libnotify.so.4 \
libpackagekit-glib2.so.18"

inherit rpm
