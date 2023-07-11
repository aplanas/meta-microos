SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "python39-libqcow-20221124-3.13.aarch64.rpm"
RPM_HASH = "33ff3faeda73bd8c1a888fc0da3355ffaee1ffde8f83d0092d654063aa88918e42c5f0c9664aed7ebd87463f21c62231994beac0109189bbdbe81a9cf865195c"

RPROVIDES:${PN} += "python39-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
