SUMMARY = "Utilities for reading Parallels Hard Disk images"
DESCRIPTION = "This subpackage contains the utility programs from libphdi to \
read Parallels Hard Disk images."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi-tools-20221025-3.8.aarch64.rpm"
RPM_HASH = "76003add3195655ef42f675ac2be6a2d55b233df73d7aa2c00f0cee808155d914b857023b32558cfc064abfe8a11770a6d3f63e9f283d2fc2b6ed8eb40de9447"

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
