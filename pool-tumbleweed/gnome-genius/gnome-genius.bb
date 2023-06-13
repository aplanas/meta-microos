SUMMARY = "GNOME interface for Genius, a general purpose calculator"
DESCRIPTION = "Genius is a general purpose calculator program similar in some aspects \
to BC, Matlab, Maple or Mathematica. It is useful both as a simple \
calculator and as a research or educational tool. The syntax mimics \
how mathematics is usually written."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.27"

RPM_NAME = "gnome-genius-1.0.27-1.9.aarch64.rpm"
RPM_HASH = "ea26353d592c4bbe962c1e924238cffe64b7e28246dc42076fc855d2033fbfc6e8e2c904557d7c2d4b64fc3238cd03274035af956f0c0c03b1cc055f255d38f1"

RPROVIDES:${PN} += "application() \
application(gnome-genius.desktop) \
gnome-genius \
gnome-genius(aarch-64) \
mimehandler(text/x-genius)"

RDEPENDS:${PN} += "genius \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgmp.so.10()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-4.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpfr.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libreadline.so.8()(64bit) \
libvte-2.91.so.0()(64bit)"

inherit rpm
