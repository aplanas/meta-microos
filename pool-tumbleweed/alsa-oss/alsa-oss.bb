SUMMARY = "LD_PRELOAD-able library that translates OSS into ALSA calls"
DESCRIPTION = "A preloadable library that intercepts Open Sound System API calls \
in applications and translates them into ALSA API calls. \
A convenience script to launch such applications with the preloaded \
library is provided as well, called 'aoss'."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.8"

RPM_NAME = "alsa-oss-1.1.8-5.3.aarch64.rpm"
RPM_HASH = "f80d866e710b72558ce47747917c773d1a68cafcdedc606602532fdfeff9b5fcca2a662d8aef1bc771cfeecbb767d7c8dad8afa1f3626caa6692bf63a7d1f237"

RPROVIDES:${PN} += "alsa-oss \
libalsatoss.so.0 \
libaoss.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
