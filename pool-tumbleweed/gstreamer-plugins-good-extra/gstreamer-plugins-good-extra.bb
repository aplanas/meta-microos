SUMMARY = "Complementary plugins for gstreamer-plugins-good"
DESCRIPTION = "This package provides complementary plugins for \
gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-good-extra-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "e90b2c91fa8d16c0f278b243e82997bbec24c16bbe6010c2755a3824154a489ef4b5309d45965feb9ee43621cfdc190721242d2f9b4fecead73e74870af29426"

RPROVIDES:${PN} += "gstreamer-plugins-good-extra \
gstreamer1 \
libgst1394.so \
libgstcacasink.so \
libgstcairo.so \
libgstdv.so \
libgstmonoscope.so \
libgstshout2.so"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libavc1394.so.0 \
libc.so.6 \
libcaca.so.0 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdv.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libiec61883.so.0 \
libraw1394.so.11 \
librom1394.so.0 \
libshout.so.3"

inherit rpm
