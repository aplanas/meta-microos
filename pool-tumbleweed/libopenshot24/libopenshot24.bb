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

PV = "0.3.1"

RPM_NAME = "libopenshot24-0.3.1-1.1.aarch64.rpm"
RPM_HASH = "f0a3955eef1dc5496490cefe94afff9f2ecb1660a2b153a1f0e00e0b416f2763089bb3c8f0581052787a57702f4d6a1c6bc524ceb610be1f5a717defbf4f078b"

RPROVIDES:${PN} += "libopenshot.so.24()(64bit) \
libopenshot24 \
libopenshot24(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libMagick++-7.Q16HDRI.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libjsoncpp.so.25()(64bit) \
libm.so.6()(64bit) \
libopenshot-audio.so.9()(64bit) \
libstdc++.so.6()(64bit) \
libswresample.so.3.9()(64bit) \
libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit) \
libswscale.so.5.9()(64bit) \
libswscale.so.5.9(LIBSWSCALE_5)(64bit) \
libzmq.so.5()(64bit)"

inherit rpm
