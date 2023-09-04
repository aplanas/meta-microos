SUMMARY = "Tools to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Tools to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libqcow-tools-20221124-4.1.aarch64.rpm"
RPM_HASH = "2ea58832aaa2c0c84ddc87c02527a6f941bffd293f52abb1c27fba49770bb4e8c0b8a3618ad63a4f112027bf135a4d168b16a85bffafe5a262cb3dd71663f5e1"

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
