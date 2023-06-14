SUMMARY = "Rate Converter Plug-In for ALSA Library using libavcodec"
DESCRIPTION = "This package contains the sample rate converter plugin for ALSA \
library using libavcodec."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-lavrate-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "f3a33272925deee5c69b2ce8e9b9a7ffb62be3d57e10d0a83b64cfddadcba1aca1002b651cdc6284f88eb5eb36e569107c1c9c2d787fadd615a2966fa5d5dd9d"

RPROVIDES:${PN} += "alsa-plugins-lavcrate \
alsa-plugins-lavrate \
libasound-module-rate-lavrate.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libavutil.so.58 \
libc.so.6 \
libswresample.so.4"

inherit rpm
