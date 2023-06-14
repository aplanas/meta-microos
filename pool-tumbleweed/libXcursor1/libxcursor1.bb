SUMMARY = "X Window System Cursor management library"
DESCRIPTION = "Xcursor a library designed to help locate and load cursors. Cursors \
can be loaded from files or memory. A library of common cursors \
exists which map to the standard X cursor names.Cursors can exist in \
several sizes and the library automatically picks the best size."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "libXcursor1-1.2.1-1.6.aarch64.rpm"
RPM_HASH = "59f125b0f38b50499e029ac10daf2508384e527014bd98317e76cffd502f117c7aee39dd2ff9b770aa058ae3e839f848b47bb452bc0395ed51ad0ea7e263c163"

RPROVIDES:${PN} += "libXcursor.so.1 \
libXcursor1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXrender.so.1 \
libc.so.6"

inherit rpm
