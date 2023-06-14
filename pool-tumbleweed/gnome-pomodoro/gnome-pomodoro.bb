SUMMARY = "A time management utility for GNOME"
DESCRIPTION = "A GNOME utility that helps managing time according to Pomodoro Technique. It \
intends to improve productivity and focus by taking short breaks after every \
25 minutes of work."
LICENSE = "GPL-3.0-or-later"

PV = "0.23.1"

RPM_NAME = "gnome-pomodoro-0.23.1-1.1.aarch64.rpm"
RPM_HASH = "8b6decb82d4dc38e7c3c435b6d73c76d3d08a0078ad2849121c4ae4025fa84b0a86dfae3560ee91cd643b491888fc04935761982793403e0f854187cb8a89d96"

RPROVIDES:${PN} += "gnome-pomodoro \
libactions.so \
libdark-theme.so \
libgnome-pomodoro.so.0 \
libgnome.so \
libsounds.so"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
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
