SUMMARY = "Utilities for reading Mac OS disk image formats"
DESCRIPTION = "This subpackage contains the utility programs from libmodi to \
read MacOS disk image formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "libmodi-tools-20221023-4.1.aarch64.rpm"
RPM_HASH = "30e08a4ce4b31e19ec4f8559703fe308fb7b8d1d814b078af1d7be6e9bf09b60a8813c4ce4de254d00fc96d9769fefe5d67b48d45185198dc9c3ce5ca4278bf5"

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
