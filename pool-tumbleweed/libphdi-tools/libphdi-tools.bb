SUMMARY = "Utilities for reading Parallels Hard Disk images"
DESCRIPTION = "This subpackage contains the utility programs from libphdi to \
read Parallels Hard Disk images."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi-tools-20221025-3.8.aarch64.rpm"
RPM_HASH = "76003add3195655ef42f675ac2be6a2d55b233df73d7aa2c00f0cee808155d914b857023b32558cfc064abfe8a11770a6d3f63e9f283d2fc2b6ed8eb40de9447"

RPROVIDES:${PN} += "libphdi-tools \
libphdi-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.2)(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libphdi.so.1()(64bit) \
libphdi.so.1(V_20221025)(64bit)"

inherit rpm
