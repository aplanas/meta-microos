SUMMARY = "Test utilities for iSCSI"
DESCRIPTION = "A comprehensive iSCSI transport and SCSI block device test suite based on \
CUnit."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.19.0+git.20230208"

RPM_NAME = "libiscsi-test-1.19.0+git.20230208-1.3.aarch64.rpm"
RPM_HASH = "10a292fde0adf30d2eb35fdf4b569e1028c517cf78d6c244fd685f02445bececbfee24e03818e9657506ed7ab74b36f802b242d3367cf70913ae12fe3bf0930b"

RPROVIDES:${PN} += "libiscsi-test \
libiscsi-test(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcunit.so.1()(64bit) \
libgcrypt.so.20()(64bit) \
libibverbs.so.1()(64bit) \
librdmacm.so.1()(64bit)"

inherit rpm
