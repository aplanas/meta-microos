SUMMARY = "The Anthy engine for IBus input platform"
DESCRIPTION = "The Anthy engine for IBus platform. It provides Japanese input method from \
libanthy."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.14"

RPM_NAME = "ibus-anthy-1.5.14-1.7.aarch64.rpm"
RPM_HASH = "f54ae99b4cc254b9aa08123673fe6aa6d8fb27ef54ee89d81776b8c376c572327e4e8e394fa3346ad351b5bf4e53d58e84a0ac0faf5ec368907679bf75fd26f9"

RPROVIDES:${PN} += "ibus-anthy \
libanthygobject-1.0.so.5 \
typelib-Anthy"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
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
