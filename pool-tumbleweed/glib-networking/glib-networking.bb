SUMMARY = "Network-related GIO modules for glib"
DESCRIPTION = "This package contains network-related GIO modules for glib. \
 \
Currently, there is only a proxy module based on libproxy."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.0"

RPM_NAME = "glib-networking-2.76.0-1.1.aarch64.rpm"
RPM_HASH = "dd27160fbda9965f81ce2b0e195c786e1681a67135cf7ce760818be3f682371c1f12d69261ba0ad2f1a09276f8392c50f1cdcc0d8fe79c0d15bb25cb5fb707a3"

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
