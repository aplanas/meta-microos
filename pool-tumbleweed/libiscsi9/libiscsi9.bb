SUMMARY = "iSCSI client library and utilities"
DESCRIPTION = "libiscsi is a clientside library to implement the iSCSI protocol \
that can be used to access resource of an iSCSI target. \
 \
The library is fully asynchronous with regards to iSCSI commands and \
SCSI tasks, but a synchronous layer is also provided for ease of use \
for simpler applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.19.0+git.20230208"

RPM_NAME = "libiscsi9-1.19.0+git.20230208-1.3.aarch64.rpm"
RPM_HASH = "075e796273241af2b7d88f2dae18b74816e268c223aef6c7e27221bd713451f31523d7170f00185198e14b06631d3b6803b52fee64eedc6f44745795071b363b"

RPROVIDES:${PN} += "libiscsi.so.9()(64bit) \
libiscsi9 \
libiscsi9(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcrypt.so.20()(64bit) \
libibverbs.so.1()(64bit) \
librdmacm.so.1()(64bit)"

inherit rpm
