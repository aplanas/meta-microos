SUMMARY = "Toolkit to write Gtk+3-based frontends to libretro"
DESCRIPTION = "retro-gtk wraps the libretro API for use in Gtk applications such as \
GNOME Games."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "retro-gtk-1.0.2-2.7.aarch64.rpm"
RPM_HASH = "8ba58199318f8069fbebd8afbb9136a14e3371a976860110f5408e1f8b922e88f2bc440d7d5fa4ea40023c9ef9223248b773db76eb942dd5d9d9cea4f1388237"

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
