SUMMARY = "Private library for Budgie"
DESCRIPTION = "Private library for Budgie desktop to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.8+0"

RPM_NAME = "libbudgie-private0-10.8+0-1.1.aarch64.rpm"
RPM_HASH = "a8219f0ea1b047187b5e5eb28f603c4c692a3ee5ad4b8b028a69e2ea5d339e8e53f87899f43cdb5857c789d79742039cf311d634268f47556b2f30a7284ea741"

RPROVIDES:${PN} += "libbudgie-private.so.0 \
libbudgie-private0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
