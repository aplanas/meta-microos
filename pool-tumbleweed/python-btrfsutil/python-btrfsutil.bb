SUMMARY = "Python bindings for developing with libbtrfsutil"
DESCRIPTION = "This package contains the python bindings to build applications to interface \
with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "6.5"

RPM_NAME = "python-btrfsutil-6.5-1.1.aarch64.rpm"
RPM_HASH = "9defeb3e5505e9bbd32e5c6ab2cbc0998e2fda927337c7c86276d674d204978a55af2f4bcc438ae660e3a369d6d50b47be08abd0b449c34bea0aebaa1af3c341"

RPROVIDES:${PN} += "python-btrfsutil \
python3.11dist-btrfsutil \
python3dist-btrfsutil"

RDEPENDS:${PN} += "btrfsprogs \
ld-linux-aarch64.so.1 \
libbtrfsutil.so.1 \
libbtrfsutil1 \
libc.so.6 \
python-abi \
python3"

inherit rpm
