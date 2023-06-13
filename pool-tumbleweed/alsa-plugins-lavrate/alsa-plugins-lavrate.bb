SUMMARY = "Rate Converter Plug-In for ALSA Library using libavcodec"
DESCRIPTION = "This package contains the sample rate converter plugin for ALSA \
library using libavcodec."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-lavrate-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "f3a33272925deee5c69b2ce8e9b9a7ffb62be3d57e10d0a83b64cfddadcba1aca1002b651cdc6284f88eb5eb36e569107c1c9c2d787fadd615a2966fa5d5dd9d"

RPROVIDES:${PN} += "alsa-plugins-lavcrate \
alsa-plugins-lavrate \
alsa-plugins-lavrate(aarch-64) \
libasound_module_rate_lavrate.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libswresample.so.4()(64bit) \
libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit)"

inherit rpm
