SUMMARY = "Complementary plugins for gstreamer-plugins-good"
DESCRIPTION = "This package provides complementary plugins for \
gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-good-extra-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "9924aba6d409600a0046a72a705f7e6798636b99714f3bb2e9da9163a6d8841b94bd37bf236b049242b911bf2110a10ef2a00ae5781abc2c2b2e24833564f5b4"

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
