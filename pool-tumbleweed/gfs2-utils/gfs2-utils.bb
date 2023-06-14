SUMMARY = "Utilities for managing the global file system (GFS2)"
DESCRIPTION = "The gfs2-utils package contains a number of utilities for creating, \
checking, modifying, and correcting any inconsistencies in GFS2 \
file systems."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.4.1"

RPM_NAME = "gfs2-utils-3.4.1-1.8.aarch64.rpm"
RPM_HASH = "c1d8ce1e773f40be8e59d770eb3119c7f16b8bbf6f2ec8c2d308383fd3a2cdec85e053b0692aac5bb94c8cd3ca6d02c13eb3e177c4f76e093be59821a174af6a"

RPROVIDES:${PN} += "gfs2-utils"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libbz2.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6 \
libuuid.so.1 \
libz.so.1"

inherit rpm
