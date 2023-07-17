SUMMARY = "Utilities for reading Mac OS disk image formats"
DESCRIPTION = "This subpackage contains the utility programs from libmodi to \
read MacOS disk image formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "libmodi-tools-20221023-3.12.aarch64.rpm"
RPM_HASH = "7b06e4609fcfac055ae68ca3bb517da383f993b79474d629914fa8983fe9a3bd26f35fd323a61d489b762a9e547921b18b89cd9c2b02506c46689a50457f64de"

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
