SUMMARY = "Utilities for reading Mac OS disk image formats"
DESCRIPTION = "This subpackage contains the utility programs from libmodi to \
read MacOS disk image formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "libmodi-tools-20221023-3.7.aarch64.rpm"
RPM_HASH = "f9adb680c492dd1f157652ab2190f444f37707e7f40260b0c2f917dcfda4060307919128b72cda36589a996bdc5d492f2c920ccd579ad9d12dc69e1da30589dc"

RPROVIDES:${PN} += "libmodi-tools \
libmodi-tools(aarch-64)"
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
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.2)(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libmodi.so.1()(64bit) \
libmodi.so.1(V_20221023)(64bit)"

inherit rpm
