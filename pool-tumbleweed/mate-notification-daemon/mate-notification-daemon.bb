SUMMARY = "Notification daemon for MATE"
DESCRIPTION = "D-Bus notification daemon for MATE."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-notification-daemon-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "bc7f027935b4bfda943eff89b7d7d6be389fdaae7c742e874b7da0c6ef75b5ecaa89bce726f1ad6e03d2b6b216321466a6de0e8953554d6faa2dd7cba9a1dae5"

RPROVIDES:${PN} += "dbus-org.freedesktop.Notifications \
libcoco.so \
libnodoka.so \
libslider.so \
libstandard.so \
mate-notification-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-desktop-2.so.17 \
libmate-panel-applet-4.so.1 \
libnotify.so.4 \
libwnck-3.so.0 \
libxml2.so.2"

inherit rpm
