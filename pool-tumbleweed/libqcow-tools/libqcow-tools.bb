SUMMARY = "Tools to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Tools to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libqcow-tools-20221124-3.13.aarch64.rpm"
RPM_HASH = "bb3afce68b129af1549414af201a3c168d8c8b7ce2e5b3bc971bd2c443a567b57360a0e2760ae25decc72aef3e263fca2664710c3a695e24f7a034f9833a179a"

RPROVIDES:${PN} += "libqcow-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfuse.so.2 \
libqcow.so.1 \
libuna.so.1"

inherit rpm
