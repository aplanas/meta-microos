SUMMARY = "Header files for libcdaudio, a library to control operation of a CD-DA"
DESCRIPTION = "libcdaudio is a library providing functions to control \
operation of a CD-ROM when playing audio CDs.  It also contains \
functions for CDDB and CD Index lookup."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.12p2"

RPM_NAME = "libcdaudio-devel-0.99.12p2-2.8.aarch64.rpm"
RPM_HASH = "1507a037596c5cab7e99b124947fb09fe79da1ef76657f6c396bf6ef8c7e081c8f547298f5ffe88fb825882166a8e9c8a7ce1fc3842e54136aa05cf444303376"

RPROVIDES:${PN} += "libcdaudio-devel \
pkgconfig-libcdaudio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libcdaudio1"

inherit rpm
