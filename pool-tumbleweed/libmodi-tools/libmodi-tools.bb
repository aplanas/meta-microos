SUMMARY = "Utilities for reading Mac OS disk image formats"
DESCRIPTION = "This subpackage contains the utility programs from libmodi to \
read MacOS disk image formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "libmodi-tools-20221023-3.7.aarch64.rpm"
RPM_HASH = "f9adb680c492dd1f157652ab2190f444f37707e7f40260b0c2f917dcfda4060307919128b72cda36589a996bdc5d492f2c920ccd579ad9d12dc69e1da30589dc"

RPROVIDES:${PN} += "libmodi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfuse.so.2 \
libmodi.so.1"

inherit rpm
