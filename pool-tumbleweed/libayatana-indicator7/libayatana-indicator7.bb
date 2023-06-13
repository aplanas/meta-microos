SUMMARY = "Ayatana panel indicator applet library"
DESCRIPTION = "This package provides the libraries required to build indicators \
and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "libayatana-indicator7-0.9.0-1.8.aarch64.rpm"
RPM_HASH = "b1ecee3692323fc1e124fc53c41910750fe14c48ce909290b9d631fdc6b84b92e5f6021c1af10119a5bf416eee79c21b58dd8a95804fef29deecc7eb26b6f22e"

RPROVIDES:${PN} += "libayatana-indicator.so.7()(64bit) \
libayatana-indicator7 \
libayatana-indicator7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
