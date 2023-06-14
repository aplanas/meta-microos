SUMMARY = "A simple user-friendly terminal emulator for the GNOME desktop"
DESCRIPTION = "A simple user-friendly terminal emulator for the GNOME desktop."
LICENSE = "GPL-3.0-only"

PV = "44.0"

RPM_NAME = "console-44.0-1.1.aarch64.rpm"
RPM_HASH = "f0459e0bbe2ddeb2fd17dc2030b2af489a36429b8aab1286e98a7660b48d86b3c5ed588ffc0195a6679c0fbd69dbe75a501be8124f08f681b1cdbb2454810947"

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
