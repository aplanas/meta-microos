SUMMARY = "The core library for the OpenShot video editor"
DESCRIPTION = "A library for video editing, composition, animation, and playback, \
which focuses on The library is written in C++ and includes full \
bindings for Python and Ruby. It features: \
 \
* Multi-layer compositing \
* Video and audio effects (chroma key, color adjustment, \
  grayscale, etc.) \
* Animation curves (Bézier, linear, constant) \
* Time mapping (curve-based slow-down, speed-up, reverse) \
* Audio mixing & resampling (curve-based) \
* Audio plug-ins (VST & AU) \
* Telecine and Inverse Telecine (film to TV, TV to film) \
* Frame rate conversions \
* Multi-processor support \
* Uses ffmpeg for format and codec support \
 \
This package contains the shared library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.2"

RPM_NAME = "libopenshot25-0.3.2-1.1.aarch64.rpm"
RPM_HASH = "9c3da7f257f86d5ff7541c3992c8f55a4fc23b6394edaab2f7db307c3e7a19b5f87de6dddd724f18fc32d43493c01f08d15cb585d805909be33a47d97c716a1b"

RPROVIDES:${PN} += "libopenshot.so.25 \
libopenshot25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libjsoncpp.so.25 \
libm.so.6 \
libopenshot-audio.so.9 \
libstdc++.so.6 \
libswresample.so.3.9 \
libswscale.so.5.9 \
libzmq.so.5"

inherit rpm
