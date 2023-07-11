SUMMARY = "Test utilities for iSCSI"
DESCRIPTION = "A comprehensive iSCSI transport and SCSI block device test suite based on \
CUnit."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.19.0+git.20230208"

RPM_NAME = "libiscsi-test-1.19.0+git.20230208-1.4.aarch64.rpm"
RPM_HASH = "b73c8b9d3f33fc4f047f01e0b914ec16e8d63fb278b92a710c237941cc3fe73ef7a12662110c06d608415d0c5e16e3d5c821791c0752282bac4fbcc410ac0fdc"

RPROVIDES:${PN} += "libiscsi-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcunit.so.1 \
libgcrypt.so.20 \
libibverbs.so.1 \
librdmacm.so.1"

inherit rpm
