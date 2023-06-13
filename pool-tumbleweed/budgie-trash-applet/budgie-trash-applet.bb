SUMMARY = "Trash applet"
DESCRIPTION = "Trash is a Budgie Desktop applet for productivity."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-trash-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "5c1670ff9321c2962fe3cb69908c88e75e683160728a7071c8a97896266c0474c2a378f5836ab4933071adad0afc9a3a4e508d4b523ad2a6268d7040b02831c2"

RPROVIDES:${PN} += "budgie-trash-applet \
budgie-trash-applet(aarch-64) \
libtrashapplet.so()(64bit)"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbudgie-plugin.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpeas-1.0.so.0()(64bit)"

inherit rpm
