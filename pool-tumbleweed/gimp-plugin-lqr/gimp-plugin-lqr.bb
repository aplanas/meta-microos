SUMMARY = "Content-aware resizing plug-in for GIMP"
DESCRIPTION = "This GIMP plug-in implements the content-aware resizing algorithm \
described in the paper 'Seam Carving for Content-Aware Image Resizing' \
by Shai Avidan and Ariel Shamir."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "gimp-plugin-lqr-0.7.2-6.13.aarch64.rpm"
RPM_HASH = "3d430cf41da63b603eff7df88b96299d69254f1af3b472efde5484bc2caa0c068f989e6a458da0b99ae48d5ecc35acdb3b2991963c3c42d8eb9e82bb4438b608"

RPROVIDES:${PN} += "gimp-lqr-plugin \
gimp-plugin-lqr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libgimpcolor-2.0.so.0 \
libgimpui-2.0.so.0 \
libgimpwidgets-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
liblqr-1.so.0"

inherit rpm
