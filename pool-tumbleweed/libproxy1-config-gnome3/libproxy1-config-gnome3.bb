SUMMARY = "Libproxy module for GNOME3 configuration"
DESCRIPTION = " \
A module to extend libproxy with capabilities to query GNOME about \
proxy settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-config-gnome3-0.4.18-2.3.aarch64.rpm"
RPM_HASH = "1abab5bf487cab04d9462bd60326b241b0a7167c7c64f71e8ee510ee96bce0f9a34da52f3b667d8bfddf8aaa3007b576429f762dd190daa747e30773553685b2"

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
