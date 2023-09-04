SUMMARY = "A simple user-friendly terminal emulator for the GNOME desktop"
DESCRIPTION = "A simple user-friendly terminal emulator for the GNOME desktop."
LICENSE = "GPL-3.0-only"

PV = "44.4"

RPM_NAME = "console-44.4-1.1.aarch64.rpm"
RPM_HASH = "4f172fc58a6dba3cb251358ae3a484b6f1fce06d6b8e891aac4c3cbe68683de61fa0a68b19b1867837d05511010fdf1e633b0a3a540a5845217cca69832b9f59"

RPROVIDES:${PN} += "console \
nautilus-extension-console"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtop-2.0.so.11 \
libpango-1.0.so.0 \
libvte-2.91-gtk4.so.0"

inherit rpm
