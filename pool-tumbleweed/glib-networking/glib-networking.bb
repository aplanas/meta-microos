SUMMARY = "Network-related GIO modules for glib"
DESCRIPTION = "This package contains network-related GIO modules for glib. \
 \
Currently, there is only a proxy module based on libproxy."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.0"

RPM_NAME = "glib-networking-2.76.0-1.1.aarch64.rpm"
RPM_HASH = "dd27160fbda9965f81ce2b0e195c786e1681a67135cf7ce760818be3f682371c1f12d69261ba0ad2f1a09276f8392c50f1cdcc0d8fe79c0d15bb25cb5fb707a3"

RPROVIDES:${PN} += "glib-networking \
glib-networking(aarch-64) \
libgiognomeproxy.so()(64bit) \
libgiognutls.so()(64bit) \
libgiolibproxy.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
glib2-tools \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_3)(64bit) \
libgnutls.so.30(GNUTLS_3_7_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libproxy.so.1()(64bit)"

inherit rpm
