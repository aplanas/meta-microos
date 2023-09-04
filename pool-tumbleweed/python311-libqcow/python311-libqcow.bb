SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "python311-libqcow-20221124-4.1.aarch64.rpm"
RPM_HASH = "91e8aca89028f20c705f3a6fa2c40c6a3ff8344ee09e8df98409f459f2a728d02acd6ec7befaf918dfd2245663daa4b5e8632f0b1cd832c6c33b9573673ca5f1"

RPROVIDES:${PN} += "python3-libqcow \
python311-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
