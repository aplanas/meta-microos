SUMMARY = "Package update status notification applet"
DESCRIPTION = "The package-update-indicator utility regularly checks for software \
updates and notifies the user about available updates using \
desktop notifications and either a status notifier icon or a \
system tray icon. \
 \
It is primarily intended for desktops which do not already have \
this functionality built-in, such as Xfce."
LICENSE = "MIT"

PV = "8"

RPM_NAME = "package-update-indicator-8-1.3.aarch64.rpm"
RPM_HASH = "e2067305dc2f91e56cf8b913eba9bc9f57640a29092ee79da5934172b41e6a28cde8fbf59c7d255a2d5edc3a9606e575d0c6a59b7a485fda459d2062c95a65ba"

RPROVIDES:${PN} += "config-package-update-indicator \
package-update-indicator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libappindicator3.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpackagekit-glib2.so.18 \
libpolkit-gobject-1.so.0 \
libupower-glib.so.3"

inherit rpm
