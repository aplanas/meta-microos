SUMMARY = "Nomad Jukebox API"
DESCRIPTION = "Nomad Jukebox API"
LICENSE = "BSD-3-Clause"

PV = "2.2.7"

RPM_NAME = "libnjb-2.2.7-111.13.aarch64.rpm"
RPM_HASH = "93c775ce1ee5c06d99d810ad6151d8879775359603e17425b98a3a5cddb91546b24dd4fef35163e7e0c207e436899b39765922a9a496ed18d79fc4d2e7fe9e19"

RPROVIDES:${PN} += "libnjb"

RDEPENDS:${PN} += "dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnjb.so.5 \
libz.so.1"

inherit rpm
