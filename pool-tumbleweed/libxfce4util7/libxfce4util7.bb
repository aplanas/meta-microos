SUMMARY = "Utility Library for the Xfce Desktop Environment"
DESCRIPTION = "libxfce4util is a general-purpose utility library with core application support \
for the Xfce Desktop Environment."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "libxfce4util7-4.18.1-1.4.aarch64.rpm"
RPM_HASH = "628f178577b5067002d3f4359d0d55bd28ab236ce4bcb419bcf2cb9a6bcd77d9a761ea637d81f54c5331f5d6ffef97787755e2b94a5fec9357d4ecfef67fe3e9"

RPROVIDES:${PN} += "libxfce4util \
libxfce4util.so.7 \
libxfce4util7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
