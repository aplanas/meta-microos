SUMMARY = "Complementary plugins for gstreamer-plugins-good"
DESCRIPTION = "This package provides complementary plugins for \
gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-good-extra-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "3d1fa6fb2b5e654ba23aae14b1847cf8d97ed0e090cff66d93231ded2173545f8492221ab9e435b6f274085bcd82380af6ffc3932b0b015e60783b27587112db"

RPROVIDES:${PN} += "gstreamer-plugins-good-extra \
gstreamer-plugins-good-extra(aarch-64) \
gstreamer1(decoder-video/x-dv)(systemstream=false)()(64bit) \
gstreamer1(decoder-video/x-dv)(systemstream=true)()(64bit) \
gstreamer1(element-cacasink)()(64bit) \
gstreamer1(element-cacatv)()(64bit) \
gstreamer1(element-cairooverlay)()(64bit) \
gstreamer1(element-dv1394src)()(64bit) \
gstreamer1(element-dvdec)()(64bit) \
gstreamer1(element-dvdemux)()(64bit) \
gstreamer1(element-hdv1394src)()(64bit) \
gstreamer1(element-monoscope)()(64bit) \
gstreamer1(element-shout2send)()(64bit) \
gstreamer1(urisource-dv)()(64bit) \
gstreamer1(urisource-hdv)()(64bit) \
libgst1394.so()(64bit) \
libgstcacasink.so()(64bit) \
libgstcairo.so()(64bit) \
libgstdv.so()(64bit) \
libgstmonoscope.so()(64bit) \
libgstshout2.so()(64bit)"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1()(64bit) \
libavc1394.so.0()(64bit) \
libc.so.6()(64bit) \
libcaca.so.0()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libdv.so.4()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libiec61883.so.0()(64bit) \
libraw1394.so.11()(64bit) \
librom1394.so.0()(64bit) \
libshout.so.3()(64bit)"

inherit rpm
