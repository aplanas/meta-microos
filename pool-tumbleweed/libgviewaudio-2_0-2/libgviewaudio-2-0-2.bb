SUMMARY = "GTK+ UVC Viewer and Capturer"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device."
LICENSE = "GPL-3.0-only"

PV = "2.0.8"

RPM_NAME = "libgviewaudio-2_0-2-2.0.8-1.7.aarch64.rpm"
RPM_HASH = "e938da299de8e1acd3fa0da6160825a770c461cfb339dd09d208db21277031075497cfdde113fccb8d81f0540e1ecbeb9d8cf7557c908c99879576936df2be81"

RPROVIDES:${PN} += "libgviewaudio-2-0-2 \
libgviewaudio-2.0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libportaudio.so.2 \
libpulse.so.0"

inherit rpm
