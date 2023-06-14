SUMMARY = "PolicyKit Authorization Framework -- GObject Library"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes. \
 \
This package contains the gobject library only."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "libpolkit-gobject-1-0-121-4.2.aarch64.rpm"
RPM_HASH = "324614982f9ac12854bda0384769955e3e93015e0049b34dbce9ae85ff533f16d801728d360b8adbe0cb469c9a2ef04086f86966cc90b12addd6746bd3c09f56"

RPROVIDES:${PN} += "libpolkit-gobject-1-0 \
libpolkit-gobject-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0 \
polkit"

inherit rpm
