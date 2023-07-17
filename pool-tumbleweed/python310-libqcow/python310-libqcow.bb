SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "python310-libqcow-20221124-3.14.aarch64.rpm"
RPM_HASH = "1320fd3dbb596b48635359a8e7b9d652f99421f8cb4d7c1768e8e06d9422a41932ac86708f50c1cc31285f32371cd4f114e4e4c29640f14ebf0927fe47d44514"

RPROVIDES:${PN} += "python310-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
