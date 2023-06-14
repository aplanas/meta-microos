SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows). \
Contains helpers needed by the spice glib client library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "libspice-client-glib-helper-0.42-1.3.aarch64.rpm"
RPM_HASH = "edaa1c642649bfb38b1ea420bfcacf34cafa3d7cad6603d35b307e76f45c1463b3bea1fe3da9e2506937a8517ae9d97059ab3193b419488ff3691f53add150c1"

RPROVIDES:${PN} += "libspice-client-glib-helper"

RDEPENDS:${PN} += "/bin/sh \
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
