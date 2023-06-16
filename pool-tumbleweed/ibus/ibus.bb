SUMMARY = "The 'Intelligent Input Bus' input method"
DESCRIPTION = "IBus, short for Intelligent Input Bus, is an input framework. IBus \
plugins then provide the particular logic how to translate keypresses \
to input characters and possibly show disambiguation windows around \
the text cursor."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-1.5.28-2.1.aarch64.rpm"
RPM_HASH = "372298955a4e05d8f7978f76ebfb78a7e57dcfb48918a9ca82535a4151700984d19d12214ddac977d08fab5328d6e8da369429e43af4c695374c6073799f4610"

RPROVIDES:${PN} += "config-ibus \
ibus \
locale-ja;ko;zh \
rpm-macro--ibus-autostartdir \
rpm-macro--ibus-componentdir \
rpm-macro--ibus-datadir \
rpm-macro--ibus-enginedir \
rpm-macro--ibus-icondir \
rpm-macro--ibus-includedir \
rpm-macro--ibus-keymapdir \
rpm-macro--ibus-libdir \
rpm-macro--ibus-libexecdir \
rpm-macro--ibus-setupdir \
rpm-macro--ibus-tabledir \
rpm-macro-ibus-requires \
rpm-macro-ibus-table-index-post \
rpm-macro-ibus-table-requires"

RDEPENDS:${PN} += "/usr/bin/sh \
dconf \
ibus-dict-emoji \
iso-codes \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libdconf.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libibus-1-0-5 \
libibus-1.0.so.5 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0 \
python-abi \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
typelib-1-0-Gtk-3-0 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-IBus \
typelib-Pango"

inherit rpm
