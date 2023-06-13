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

RPROVIDES:${PN} += "application() \
application(org.guido-berhoerster.code.package-update-indicator.preferences.desktop) \
config(package-update-indicator) \
package-update-indicator \
package-update-indicator(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libappindicator3.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpackagekit-glib2.so.18()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libupower-glib.so.3()(64bit)"

inherit rpm
