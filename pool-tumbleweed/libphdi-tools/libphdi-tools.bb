SUMMARY = "Utilities for reading Parallels Hard Disk images"
DESCRIPTION = "This subpackage contains the utility programs from libphdi to \
read Parallels Hard Disk images."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi-tools-20221025-3.11.aarch64.rpm"
RPM_HASH = "ecf4270a44e64a55402a51f6be3f384af6fb1b1c41405ef8a17f41914a52c55c4bba0d57abbbe7d0b3537dc1f7c55d178080e37aad913983c1917d8b1deeb02c"

RPROVIDES:${PN} += "libphdi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfguid.so.1 \
libfuse.so.2 \
libphdi.so.1"

inherit rpm
