SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "python39-libqcow-20221124-3.9.aarch64.rpm"
RPM_HASH = "816aeaeca78ef6a69798c39d49e4c31183629d4bdc214458f03cf36c99a5d43b67e05b3f548b1cedd7ed56f81226d0c0f035e1e2fcac2550a259273e4fd5b2d4"

RPROVIDES:${PN} += "python39-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
