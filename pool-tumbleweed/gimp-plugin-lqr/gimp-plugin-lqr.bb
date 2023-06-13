SUMMARY = "Content-aware resizing plug-in for GIMP"
DESCRIPTION = "This GIMP plug-in implements the content-aware resizing algorithm \
described in the paper 'Seam Carving for Content-Aware Image Resizing' \
by Shai Avidan and Ariel Shamir."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "gimp-plugin-lqr-0.7.2-6.13.aarch64.rpm"
RPM_HASH = "3d430cf41da63b603eff7df88b96299d69254f1af3b472efde5484bc2caa0c068f989e6a458da0b99ae48d5ecc35acdb3b2991963c3c42d8eb9e82bb4438b608"

RPROVIDES:${PN} += "gimp-lqr-plugin \
gimp-plugin-lqr \
gimp-plugin-lqr(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgimp-2.0.so.0()(64bit) \
libgimpbase-2.0.so.0()(64bit) \
libgimpcolor-2.0.so.0()(64bit) \
libgimpui-2.0.so.0()(64bit) \
libgimpwidgets-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
liblqr-1.so.0()(64bit)"

inherit rpm
