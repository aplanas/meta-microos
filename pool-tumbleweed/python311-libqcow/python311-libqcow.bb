SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "python311-libqcow-20221124-3.14.aarch64.rpm"
RPM_HASH = "c510a3ed2b9699bcc8b7c9a23b3ca5a9b6fa1c42be953917f1cd81e6b32a498d25ed3dd6eb5fdc8fe23ab3cf9125de9d8446316b5e1674aad49dbfddc912e70e"

RPROVIDES:${PN} += "python3-libqcow \
python311-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
