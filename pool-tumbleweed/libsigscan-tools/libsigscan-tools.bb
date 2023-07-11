SUMMARY = "Tools to scan for binary signatures"
DESCRIPTION = "Tools to scan binary files for signatures."
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "libsigscan-tools-20230109-1.6.aarch64.rpm"
RPM_HASH = "40edfa250b6468834597e6cb0e5a99bcccc1682ec13c46287485dd692da590760a739b3646f7de1ddf13ab3285109976c7cbf67ae2d2f99e7485a9f3d9556ee2"

RPROVIDES:${PN} += "config-libsigscan-tools \
libsigscan-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libsigscan.so.1 \
libsigscan1"

inherit rpm
