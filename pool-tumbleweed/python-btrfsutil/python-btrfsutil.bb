SUMMARY = "Python bindings for developing with libbtrfsutil"
DESCRIPTION = "This package contains the python bindings to build applications to interface \
with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "python-btrfsutil-6.3-3.1.aarch64.rpm"
RPM_HASH = "5da0230485d7a8a91c513678d54cfad3e63f621cdff2cafe2a63816bfe4585a8fd55484756ec0326b3b30e1baa29bfe4a768ee0d2e381180009e606a9852eff3"

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
