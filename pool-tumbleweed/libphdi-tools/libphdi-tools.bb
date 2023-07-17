SUMMARY = "Utilities for reading Parallels Hard Disk images"
DESCRIPTION = "This subpackage contains the utility programs from libphdi to \
read Parallels Hard Disk images."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi-tools-20221025-3.12.aarch64.rpm"
RPM_HASH = "9dbed8c680fa6aa6722a76740bca9e2623e4e905866a3bab1d4a04ab5e0d5f146a3467cca460deb7f81dc504e10cb755041a1225988baf2712f09d33ab3fe8df"

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
