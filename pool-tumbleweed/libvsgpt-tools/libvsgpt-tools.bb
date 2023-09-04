SUMMARY = "Utilities for inspecting GUID partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsgpt to \
inspect GUID partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "libvsgpt-tools-20221029-4.1.aarch64.rpm"
RPM_HASH = "49cc892c65f3cf87254056280151b23d3fea5c4338c511a9c803e11104c06e7ad5693543ff42bf9c5f39de7ec771d0f608f9a11e1ecc66c3046164c7d4031abb"

RPROVIDES:${PN} += "libvsgpt-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfguid.so.1 \
libvsgpt.so.1"

inherit rpm
