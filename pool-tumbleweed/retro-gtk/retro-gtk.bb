SUMMARY = "Toolkit to write Gtk+3-based frontends to libretro"
DESCRIPTION = "retro-gtk wraps the libretro API for use in Gtk applications such as \
GNOME Games."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "retro-gtk-1.0.2-2.8.aarch64.rpm"
RPM_HASH = "f2b3fc1fc574ad03839773d6c5b7a7e526349ae340297b72c8d127498c28bdd19556ff0a55e7738c539638ce5ae915c6efe9df2a5378c8fa2605f2b847c1c132"

RPROVIDES:${PN} += "retro-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsamplerate.so.0"

inherit rpm
