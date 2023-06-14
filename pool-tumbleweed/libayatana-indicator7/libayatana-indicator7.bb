SUMMARY = "Ayatana panel indicator applet library"
DESCRIPTION = "This package provides the libraries required to build indicators \
and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "libayatana-indicator7-0.9.0-1.8.aarch64.rpm"
RPM_HASH = "b1ecee3692323fc1e124fc53c41910750fe14c48ce909290b9d631fdc6b84b92e5f6021c1af10119a5bf416eee79c21b58dd8a95804fef29deecc7eb26b6f22e"

RPROVIDES:${PN} += "libayatana-indicator.so.7 \
libayatana-indicator7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
