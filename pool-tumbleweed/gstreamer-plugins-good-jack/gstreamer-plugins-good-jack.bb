SUMMARY = "Jack plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the jack plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-good-jack-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "8c4c11ac38305fee0f8a4144e4b5c14bdc1352c5f77baf5e9d2d76716bc1c7cd6fe700b72a9d64801434ef4d51b661c0e37ac3f746f09d48945afc531a024aaf"

RPROVIDES:${PN} += "gstreamer-plugins-good-jack \
gstreamer-plugins-good-jack(aarch-64) \
gstreamer1(element-jackaudiosink)()(64bit) \
gstreamer1(element-jackaudiosrc)()(64bit) \
libgstjack.so()(64bit)"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libjack.so.0()(64bit)"

inherit rpm
