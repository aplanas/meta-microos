SUMMARY = "Trash applet"
DESCRIPTION = "Trash is a Budgie Desktop applet for productivity."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-trash-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "03395cc782e1c60d854b95c6a2c5303bd7131638f32389e1d15d025ed76df83b4fa9c600f7136cdecb11d3ffc2d1ce98b7dfaddfd7c3afd1ccc07a7ff98db914"

RPROVIDES:${PN} += "budgie-trash-applet \
libtrashapplet.so"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
