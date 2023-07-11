SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "python311-libqcow-20221124-3.13.aarch64.rpm"
RPM_HASH = "89aa562b7c32af6e4e1fc6d17637871e1542e2646f174a350052418b3202835d9c0d274e324f4653619e7d784edbdb52a4f2473351828e7b8b91965d04602b95"

RPROVIDES:${PN} += "python3-libqcow \
python311-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
