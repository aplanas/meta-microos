SUMMARY = "GNOME Keyboard Library"
DESCRIPTION = "GNOME keyboard shared library. \
 \
This package provides the shared library of libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "libgnomekbd8-3.28.1-1.4.aarch64.rpm"
RPM_HASH = "22e8e4e52755664ddbbb09e3d55e948d75f1ce0851584e44e3fbf946acc1fbd506bcc1f2240870a4c10f1e761d2a721315a67fc74516de9d8883bcebd2d2faf7"

RPROVIDES:${PN} += "libgnomekbd \
libgnomekbd.so.8 \
libgnomekbd8 \
libgnomekbdui.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxklavier.so.16"

inherit rpm
