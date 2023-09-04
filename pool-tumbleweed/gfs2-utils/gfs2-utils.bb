SUMMARY = "Utilities for managing the global file system (GFS2)"
DESCRIPTION = "The gfs2-utils package contains a number of utilities for creating, \
checking, modifying, and correcting any inconsistencies in GFS2 \
file systems."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "gfs2-utils-3.5.1-1.1.aarch64.rpm"
RPM_HASH = "942e259c929bcf400bf765b8eb4a5d07c75328cf4fbd872229bc7db770913ed71257c465e638d7ea0469a5687c480144b5418ca27810a71315a3fbe25971ce0e"

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
