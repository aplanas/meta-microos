SUMMARY = "Notification daemon for MATE"
DESCRIPTION = "D-Bus notification daemon for MATE."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-notification-daemon-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "bc7f027935b4bfda943eff89b7d7d6be389fdaae7c742e874b7da0c6ef75b5ecaa89bce726f1ad6e03d2b6b216321466a6de0e8953554d6faa2dd7cba9a1dae5"

RPROVIDES:${PN} += "application() \
application(mate-notification-properties.desktop) \
dbus(org.freedesktop.Notifications) \
libcoco.so()(64bit) \
libnodoka.so()(64bit) \
libslider.so()(64bit) \
libstandard.so()(64bit) \
mate-notification-daemon \
mate-notification-daemon(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libmate-desktop-2.so.17()(64bit) \
libmate-panel-applet-4.so.1()(64bit) \
libnotify.so.4()(64bit) \
libwnck-3.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
