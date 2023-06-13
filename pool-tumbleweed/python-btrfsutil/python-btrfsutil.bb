SUMMARY = "Python bindings for developing with libbtrfsutil"
DESCRIPTION = "This package contains the python bindings to build applications to interface \
with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "python-btrfsutil-6.3-1.1.aarch64.rpm"
RPM_HASH = "ed55a5106688ad000e49aff01ec1e96a11c3a2d27de729216862d7fa82bc01baf82f8d0490d2340b56d18b47a261ba719e109682cf1d7f36f2a4dbe82f7d57bd"

RPROVIDES:${PN} += "python-btrfsutil \
python-btrfsutil(aarch-64) \
python3.10dist(btrfsutil) \
python3dist(btrfsutil)"

RDEPENDS:${PN} += "btrfsprogs \
ld-linux-aarch64.so.1()(64bit) \
libbtrfsutil.so.1()(64bit) \
libbtrfsutil1 \
libc.so.6()(64bit) \
python(abi) \
python3"

inherit rpm
