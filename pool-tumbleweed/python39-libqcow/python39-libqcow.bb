SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "python39-libqcow-20221124-3.14.aarch64.rpm"
RPM_HASH = "10bef2b6751d50ab6c04c46cca40ace8d59229a36a884b71e9f3d86f0bc1a271022c792480789424e373eedfe8549df6a8aafec46dcbde9bc38f7131aeaf1dca"

RPROVIDES:${PN} += "python39-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
