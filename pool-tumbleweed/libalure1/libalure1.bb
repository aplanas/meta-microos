SUMMARY = "Utility library around OpenAL"
DESCRIPTION = "ALURE is a utility library to help manage common tasks with OpenAL \
applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "libalure1-1.2-4.5.aarch64.rpm"
RPM_HASH = "e83cc63221eda241ad401d24528f623ee6a2af870ce4bbdcd1f01c307187a69b4c1aee5a76f2c5d650f1641c9d2b9ae69fadc43eb5fda1beac6a3985bb61fd6a"

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
