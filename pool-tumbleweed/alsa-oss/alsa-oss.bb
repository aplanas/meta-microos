SUMMARY = "LD_PRELOAD-able library that translates OSS into ALSA calls"
DESCRIPTION = "A preloadable library that intercepts Open Sound System API calls \
in applications and translates them into ALSA API calls. \
A convenience script to launch such applications with the preloaded \
library is provided as well, called 'aoss'."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.8"

RPM_NAME = "alsa-oss-1.1.8-5.2.aarch64.rpm"
RPM_HASH = "8a923e25df08c1dd96f2cff2f8b63920aecdc0a4ff3ac3d3bd13402ce6ed7c3688600b8f56686fd3814864b29a50c3061b3079b66798ca09061a886cde4ff09e"

RPROVIDES:${PN} += "alsa-oss \
libalsatoss.so.0 \
libaoss.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
