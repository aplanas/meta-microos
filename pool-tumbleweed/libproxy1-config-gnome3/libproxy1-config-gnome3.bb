SUMMARY = "Libproxy module for GNOME3 configuration"
DESCRIPTION = " \
A module to extend libproxy with capabilities to query GNOME about \
proxy settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-config-gnome3-0.4.18-2.1.aarch64.rpm"
RPM_HASH = "e02498ca85c593776e37ae574ea27b99557317f2a4d9f14fa393f37a1c88ab57cfb247b2b6a8962e7485516bf685a24950d78fe66096fd963d681c204944a61b"

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
