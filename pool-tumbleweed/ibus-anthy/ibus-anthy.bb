SUMMARY = "The Anthy engine for IBus input platform"
DESCRIPTION = "The Anthy engine for IBus platform. It provides Japanese input method from \
libanthy."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.14"

RPM_NAME = "ibus-anthy-1.5.14-1.6.aarch64.rpm"
RPM_HASH = "b19a6af1f6258b58fd46ddf7630557a3214ee7c1272761cd722193f2a2c511758de1b2e243618611e9501eacacc002f214bc7d0da30dfa10f95a3c6a16df1140"

RPROVIDES:${PN} += "ibus-anthy \
libanthygobject-1.0.so.5 \
typelib-Anthy"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
anthy \
ld-linux-aarch64.so.1 \
libanthy.so.0 \
libanthydic.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
python3-gobject \
typelib-Anthy \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-IBus \
typelib-Pango"

inherit rpm
