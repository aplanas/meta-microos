SUMMARY = "Delta Filesystem"
DESCRIPTION = "Deltafs combines a read-only lower directory and a read-write upper \
directory into a new filesystem.  Currently it works very similarly to \
a union filesystem, where upon modification whole files are copied up \
to the upper layer.  There are plans to store differences more \
efficiently in the future."
LICENSE = "GPL-2.0"

PV = "1.0"

RPM_NAME = "deltafs-1.0-23.29.aarch64.rpm"
RPM_HASH = "5bb62ddf505e05a1d62fe3b113e03758f8ffb5064bd04e6b3b197d8e2d871253ea9a2d4008548b9d81907de48036775fdf3367c9edae82b4e74b99d6b9b0f375"

RPROVIDES:${PN} += "deltafs"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2"

inherit rpm
