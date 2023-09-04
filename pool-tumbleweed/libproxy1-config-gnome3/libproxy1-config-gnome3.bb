SUMMARY = "Libproxy module for GNOME3 configuration"
DESCRIPTION = " \
A module to extend libproxy with capabilities to query GNOME about \
proxy settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-config-gnome3-0.4.18-2.4.aarch64.rpm"
RPM_HASH = "516b5f8219dc708a12fe36742f7809fd3a95a9030c1766cf1e2d668ffcf493f1b6f761ae2a5ecf7ff5bf6248679968c0595f64cbac74656e8eee523d17b2e79a"

RPROVIDES:${PN} += "libproxy-gnome \
libproxy1-config-gnome3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libproxy.so.1 \
libproxy1 \
libstdc++.so.6"

inherit rpm
