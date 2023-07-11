SUMMARY = "Utilities for reading Mac OS disk image formats"
DESCRIPTION = "This subpackage contains the utility programs from libmodi to \
read MacOS disk image formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "libmodi-tools-20221023-3.11.aarch64.rpm"
RPM_HASH = "9146c648ac028899840aa6eeb15715a1ddd6e594e6ca69fd846516f0c2c3fdb87b7b309aa507bdc025a4c9044b9c862618cb6c407eb3e8be69c557e76ee03fe5"

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
