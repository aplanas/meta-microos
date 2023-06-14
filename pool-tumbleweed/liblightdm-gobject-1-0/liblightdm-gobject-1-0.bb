SUMMARY = "LightDM GObject-based Client Library"
DESCRIPTION = "A GObject-based library for LightDM clients to use to interface \
with LightDM."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "liblightdm-gobject-1-0-1.32.0-2.2.aarch64.rpm"
RPM_HASH = "85517ced8f302a0c3da36c6f08174cb27bc64cdccf96c8c5104afe99a771e5cf44c16eb7fee111131f7533525b25b1224ce35aaa91e45ad09c4ad9b9f9884fcc"

RPROVIDES:${PN} += "liblightdm-gobject-1-0 \
liblightdm-gobject-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxklavier.so.16"

inherit rpm
