SUMMARY = "Tools to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Tools to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libqcow-tools-20221124-3.9.aarch64.rpm"
RPM_HASH = "1114c0c75d7da361607326976159218d3705ed4b6693384044979231cbc241a79305f9e824df116602915090ed20a33890e52492fc944a1540e087d9b02afad9"

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
