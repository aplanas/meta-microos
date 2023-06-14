SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "python311-libqcow-20221124-3.9.aarch64.rpm"
RPM_HASH = "73e3a15a72fca566bdb050fb868b920be56ba44ecd5167c20dabfa923e4c313fb148959f34a9be3776490b8fb3952c7522c33c797a99040898cb55d3a4e32012"

RPROVIDES:${PN} += "python311-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
