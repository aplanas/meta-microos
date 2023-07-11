SUMMARY = "Utilities for managing the global file system (GFS2)"
DESCRIPTION = "The gfs2-utils package contains a number of utilities for creating, \
checking, modifying, and correcting any inconsistencies in GFS2 \
file systems."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.4.1"

RPM_NAME = "gfs2-utils-3.4.1-1.9.aarch64.rpm"
RPM_HASH = "119e0cd186187c62d94acafd936a2cf8366ca71d5f14a9d1b45bfe15b20909ed330f8ec3bd4f6bf73aa1c0850bbfe49a7e9d3f9ce15b8c13d356c865ad099642"

RPROVIDES:${PN} += "gfs2-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libbz2.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6 \
libuuid.so.1 \
libz.so.1"

inherit rpm
