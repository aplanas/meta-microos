SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "python310-libqcow-20221124-3.13.aarch64.rpm"
RPM_HASH = "d99c38fa8014a70e641fbab182910961e2759ba7116764b2b3a5bcebf9278d5cfc45da4150e6e22fb2327a5b68d0e1c6762d9407da7520ce2f2b10e74cc6569a"

RPROVIDES:${PN} += "python310-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
