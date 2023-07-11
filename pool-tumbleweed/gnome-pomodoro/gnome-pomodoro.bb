SUMMARY = "A time management utility for GNOME"
DESCRIPTION = "A GNOME utility that helps managing time according to Pomodoro Technique. It \
intends to improve productivity and focus by taking short breaks after every \
25 minutes of work."
LICENSE = "GPL-3.0-or-later"

PV = "0.23.1"

RPM_NAME = "gnome-pomodoro-0.23.1-1.2.aarch64.rpm"
RPM_HASH = "5f3505077c749b07f47480361ee6d74ac1820c2b10d92e84d006baa07900b6990764acee97cc8035c80b8b58ee62e1c2bdb7c2d09548ccf42c730ceff458c786"

RPROVIDES:${PN} += "gnome-pomodoro \
libactions.so \
libdark-theme.so \
libgnome-pomodoro.so.0 \
libgnome.so \
libsounds.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
gnome-shell \
gstreamer \
gtk3 \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgom-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpeas-1.0.so.0 \
libsqlite3.so.0 \
typelib-Atk \
typelib-Clutter \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-Shell \
typelib-St"

inherit rpm
