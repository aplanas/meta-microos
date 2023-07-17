SUMMARY = "Tools to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Tools to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libqcow-tools-20221124-3.14.aarch64.rpm"
RPM_HASH = "7f6b6da8c3f1a3f86cb1edac5c1b1316d0ed53dfba1e8140be5c92acef6d9881955a7a233adfa5c34e0ac16fae62abee9f8358fe2084bd1fce659f3d6621e370"

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
