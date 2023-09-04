SUMMARY = "Utilities for reading storage media devices through libsmdev"
DESCRIPTION = "This subpackage contains the utility programs from libsmdev, which \
can access and read storage media devices and will determine \
information about such."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "libsmdev-tools-20221028-3.1.aarch64.rpm"
RPM_HASH = "e41da83386a313b8c31c3bdf259997948d06c283d6c2543a964a8830c949a35dffa81a44da6e39ffec8af95480ec0a029b315ff15f622d0f98cc4134804ec7e5"

RPROVIDES:${PN} += "libsmdev-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libsmdev.so.1"

inherit rpm
