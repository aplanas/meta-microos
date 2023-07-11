SUMMARY = "Showtime applet"
DESCRIPTION = "Budgie Showtime is a digital desktop clock, showing time, and optionally, date. \
Textcolor of both can be set separately from the applet's menu."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-showtime-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "3cd10dc289113cf22c1883673f9f2056729e6902d5677ed6f4d4770319cf02a8393e70cce7655d58a54b685226b2bb735e258397bd79b6d38fbd0a4c0f46cd0f"

RPROVIDES:${PN} += "budgie-showtime-applet \
libbudgieshowtime.so"

RDEPENDS:${PN} += "budgie-extras-lang \
dconf \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpeas-1.0.so.0 \
libwnck-3.so.0"

inherit rpm
