SUMMARY = "Caja extension for the ACL viewer and editor"
DESCRIPTION = "A Caja extension that allows viewing and editing ACL permissions."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.1"

RPM_NAME = "caja-extension-eiciel-1.20.1-2.9.aarch64.rpm"
RPM_HASH = "8d3201c9dabb707b20449527a8325c665cc2c93df76ee16f86689dcdb6ad9472d39d560c6461eae227ad0222f50fe31257848bc002c46e9ef51fd07e09c330b0"

RPROVIDES:${PN} += "caja-extension-eiciel \
libeiciel-caja.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libcaja-extension.so.1 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
mate-eiciel"

inherit rpm
