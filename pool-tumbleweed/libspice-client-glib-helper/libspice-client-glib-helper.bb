SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows). \
Contains helpers needed by the spice glib client library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "libspice-client-glib-helper-0.42-2.1.aarch64.rpm"
RPM_HASH = "e042eac9913c51695d6b326846c6339d29193c62f15a25f5a0993a18e6f461a00682c867f78f05348ff4be42c1b55c8dc11e0313423f608d4c026ea23d6af466"

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
