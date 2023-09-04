SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "python310-libqcow-20221124-4.1.aarch64.rpm"
RPM_HASH = "71d3be76612a3a747354672d64842d00a0bea3e0ac2d87978123170726a72fef5fdcd6f0d13f2015f2d7348c4fc6111d1eab569922416cfb8135e5d6672fd461"

RPROVIDES:${PN} += "python310-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
