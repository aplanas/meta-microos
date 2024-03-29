SUMMARY = "PCM I/O Plug-In for ALSA Library to access USB USx2y audio"
DESCRIPTION = "This package contains a PCM I/O plugin to access USB USx2y audio devices \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-usb-stream-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "7d1089a0d3a46b7c148078bc0edd51701bea660992ad64886424dafbde4a34b90104a8bb80a1114451640ddf9b20f2756e1bf9b22fc9cb1431cc36df48659e24"

RPROVIDES:${PN} += "alsa-plugins-usb-stream \
libasound-module-pcm-usb-stream.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
