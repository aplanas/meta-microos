SUMMARY = "Network-related GIO modules for glib"
DESCRIPTION = "This package contains network-related GIO modules for glib. \
 \
Currently, there is only a proxy module based on libproxy."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.1"

RPM_NAME = "glib-networking-2.76.1-1.1.aarch64.rpm"
RPM_HASH = "9afa9a93958b8f936869eec355fe8dd866cc9ebd52de579d4c278800746e4722c45fce723646d8ed3ff481247b8d643c0b05ffec928e3c24493e7bd03eeaf38b"

RPROVIDES:${PN} += "glib-networking \
libgiognomeproxy.so \
libgiognutls.so \
libgiolibproxy.so"

RDEPENDS:${PN} += "/usr/bin/sh \
glib2-tools \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libproxy.so.1"

inherit rpm
