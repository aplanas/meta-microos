SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "python39-libqcow-20221124-4.1.aarch64.rpm"
RPM_HASH = "73412fc66c88e7d82bda4812343c4d6b1fe29ddbca3e71b5481988120ff111a6aff5784210692e9724ad42664d094528014099229232a24015604e6a0103aaca"

RPROVIDES:${PN} += "python39-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
