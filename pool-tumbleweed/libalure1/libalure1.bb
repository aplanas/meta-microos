SUMMARY = "Utility library around OpenAL"
DESCRIPTION = "ALURE is a utility library to help manage common tasks with OpenAL \
applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "libalure1-1.2-4.4.aarch64.rpm"
RPM_HASH = "d84a64f60cd5e7c1f4aef390b94ab8960f97e1c3a6f54e0ad25f320ea00b12681b47fe5b3154716d452a31c03cc35537bb4e28db35c1283ff163f4b02f7f595d"

RPROVIDES:${PN} += "libalure.so.1 \
libalure1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libc.so.6 \
libdumb.so.2 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libmodplug.so.1 \
libmpg123.so.0 \
libopenal.so.1 \
libsndfile.so.1 \
libstdc++.so.6 \
libvorbisfile.so.3"

inherit rpm
