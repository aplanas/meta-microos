SUMMARY = "GTK GUI implementation of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3"

RPM_NAME = "libaudgui5-4.3-1.3.aarch64.rpm"
RPM_HASH = "9af2cdc9e65d8d944984dcefac9de2b546c58bdb783b4b2d93bcc0d2944b9045cf2065c65bbb83806a7ff47162c427388968855437731dd463ce42704d4a211e"

RPROVIDES:${PN} += "libaudgui.so.5 \
libaudgui5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudcore.so.5 \
libaudcore5 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
