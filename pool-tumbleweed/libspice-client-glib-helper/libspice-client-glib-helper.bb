SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows). \
Contains helpers needed by the spice glib client library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "libspice-client-glib-helper-0.42-1.5.aarch64.rpm"
RPM_HASH = "7f6aa40124d99caac256d42c034defe3e8cb11052080bdb3df24c54b29a0069e4276f8ed58599cf376f7a23ec028510e3de656ed60167fd497865a6a7521679a"

RPROVIDES:${PN} += "libspice-client-glib-helper"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kvm \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0 \
permissions"

inherit rpm
